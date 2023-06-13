package com.solvd.laba.xmlparser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class SportsCarParserRunner {
    public static void main(String[] args) {
        // reading xml documents using DOM
        // Java DOM parser: parses xml document by loading
        // the complete contents of the document and creating its complete hierarchical
        // tree in memory
        try {
            File xmlDoc = new File("src/main/java/com/solvd/laba/xmlparser/sportsCar.xml");
            DocumentBuilderFactory dbFact = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuild = dbFact.newDocumentBuilder();
            Document doc = dbBuild.parse(xmlDoc);


            NodeList nList = doc.getElementsByTagName("sportsCar");

            // Read the xml document

            for(int i=0;i<nList.getLength();i++){
                Node nNode = nList.item(i);
                System.out.println("Node name " + nNode.getNodeName() + " " + (i+1));
                if(nNode.getNodeType()== Node.ELEMENT_NODE){
                    Element eElement = (Element) nNode;
                    System.out.println("Sports car brand: " +
                            eElement.getElementsByTagName("brand").item(0).getTextContent());
                    System.out.println("Sports car model: " +
                            eElement.getElementsByTagName("model").item(0).getTextContent());
                    System.out.println("Sports Car Top Speed: " +
                            eElement.getElementsByTagName("topSpeed").item(0).getTextContent());
                    System.out.println("Sports car price: " +
                            eElement.getElementsByTagName("price").item(0).getTextContent());
                    System.out.println("---------------------------------------------------------");
                }
            }

        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new RuntimeException(e);
        }
    }
}


