/*-
 * #%L
 * CWE Parser
 * %%
 * Copyright (C) 2016 Matthieu Jimenez
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package lu.jimenez.research.cweparser

import lu.jimenez.research.cweparser.generatedObject.Category
import lu.jimenez.research.cweparser.generatedObject.Weakness
import lu.jimenez.research.cweparser.generatedObject.WeaknessCatalog
import java.io.File
import java.io.FileNotFoundException
import javax.xml.bind.JAXBContext

/**
 * Parser class
 *
 * This class unmarshall a xml file conform to the xsd in its 5.4.2 version
 *
 * @param xmlFile Path to the xml File
 */
class Parser(xmlFile: String) {
    val weaknessCatalog: WeaknessCatalog

    init {

        if (xmlFile.split(".").last() != "xml") {
            throw FileNotFoundException("This is not a xml file")
        }
        val file = File(xmlFile)
        if (!file.exists() || !file.isFile) {
            throw FileNotFoundException("This is not a file")
        }
        val jaxbContext = JAXBContext.newInstance(WeaknessCatalog::class.java)
        val jacbUnmarshaller = jaxbContext.createUnmarshaller()
        weaknessCatalog = jacbUnmarshaller.unmarshal(file) as WeaknessCatalog
    }

    /**
     * return all the categories of the file
     */
    fun categoryList(): List<Category> {
        return weaknessCatalog.categories.category
    }

    /**
     * return all weaknesses present in the file
     */
    fun weaknessList(): List<Weakness> {
        return weaknessCatalog.weaknesses.weakness
    }

    /**
     * return the list of all cwe present in the file
     */
    fun cweList(): List<CWE> {
        val listCWE = mutableListOf<CWE>()

        for (cat in categoryList()){
            val cwe =CWE(
                    cat.id.toInt(),
                    cat.name,
                    cat.description.descriptionSummary,
                    cat.relationships?.relationship?.filter { relation -> relation.relationshipNature == "ChildOf" }?.map { relation -> relation.relationshipTargetID.toInt() } ?: listOf()
            )
            listCWE.add(cwe)
        }
        for(weakness in weaknessList()){
            listCWE.add(
                    CWE(
                            weakness.id.toInt(),
                            weakness.name,
                            weakness.description.descriptionSummary,
                            weakness.relationships?.relationship?.filter { relation -> relation.relationshipNature == "ChildOf" }?.map { relation -> relation.relationshipTargetID.toInt() }?: listOf()
                    )
            )
        }
        return listCWE
    }


    companion object main {
        /**
         * Example use of the project
         */
        @JvmStatic
        fun main(args: Array<String>) {
            val url = javaClass.classLoader.getResource("699.xml").path
            val unma = Parser(url)
            val list = unma.cweList()
            println(list.size)
            for (cwe in list) {
                println(cwe.id)
            }
        }
    }

}


