package com.solvd.laba.xmlparser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

public class CarXmlParserRunner {
    private static final Logger LOGGER = LogManager.getLogger(CarXmlParserRunner.class);
    public static void main(String[] args) {
        // reading xml documents using DOM
        // Java DOM parser: parses xml document by loading
        // the complete contents of the document and creating its complete hierarchical
        // tree in memory
        try {
            File xmlDoc = new File("src/main/resources/cars.xml");
            DocumentBuilderFactory dbFact = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuild = dbFact.newDocumentBuilder();
            Document doc = dbBuild.parse(xmlDoc);


            NodeList nList = doc.getElementsByTagName("car");
            NodeList nList2 = doc.getElementsByTagName("electricCar");
            NodeList nList3 = doc.getElementsByTagName("gasolineCar");
            NodeList nList4 = doc.getElementsByTagName("sportsCar");
            NodeList nList5 = doc.getElementsByTagName("usedCar");

            // Read the xml document
            // Class1
            for(int i=0;i<nList.getLength();i++){
                Node nNode = nList.item(i);
                //System.out.println("Node name " + nNode.getNodeName() + " " + (i+1));
                LOGGER.info("Node name " + nNode.getNodeName() + " " + (i+1));
                if(nNode.getNodeType()== Node.ELEMENT_NODE){
                    Element eElement = (Element) nNode;
                    //System.out.println("Car id: " + eElement.getAttribute("id"));
                    LOGGER.info("Car id: " + eElement.getAttribute("id"));
                    //System.out.println("Car brand: " + eElement.getElementsByTagName("brand").item(0).getTextContent());
                    LOGGER.info("Car brand: " + eElement.getElementsByTagName("brand").item(0).getTextContent());
                    //System.out.println("Car model: " + eElement.getElementsByTagName("model").item(0).getTextContent());
                    LOGGER.info("Car model: " + eElement.getElementsByTagName("model").item(0).getTextContent());
                    //System.out.println("Car year: " + eElement.getElementsByTagName("year").item(0).getTextContent());
                    LOGGER.info("Car year: " + eElement.getElementsByTagName("year").item(0).getTextContent());
                    //System.out.println("Car price: " + eElement.getElementsByTagName("price").item(0).getTextContent());
                    LOGGER.info("Car price: " + eElement.getElementsByTagName("price").item(0).getTextContent());
                    //System.out.println("---------------------------------------------------------");
                    LOGGER.info("------------------------------------------------------------------");
                }
            }


            // Class2
            for(int i=0;i<nList.getLength();i++){
                Node nNode = nList2.item(i);
                //System.out.println("Node name " + nNode.getNodeName() + " " + (i+1));
                LOGGER.info("Node name " + nNode.getNodeName() + " " + (i+1));
                if(nNode.getNodeType()== Node.ELEMENT_NODE){
                    Element eElement = (Element) nNode;
                    //System.out.println("Car id: " + eElement.getAttribute("id"));
                    LOGGER.info("Electric Car id: " + eElement.getAttribute("id"));
                    //System.out.println("Car brand: " + eElement.getElementsByTagName("brand").item(0).getTextContent());
                    LOGGER.info("Electric Car brand: " + eElement.getElementsByTagName("brand").item(0).getTextContent());
                    //System.out.println("Car model: " + eElement.getElementsByTagName("model").item(0).getTextContent());
                    LOGGER.info("Electric Car model: " + eElement.getElementsByTagName("model").item(0).getTextContent());
                    //System.out.println("Car year: " + eElement.getElementsByTagName("year").item(0).getTextContent());
                    LOGGER.info("Electric Car battery capacity: " + eElement.getElementsByTagName("batteryCapacity").item(0).getTextContent());
                    //System.out.println("Car price: " + eElement.getElementsByTagName("price").item(0).getTextContent());
                    LOGGER.info("Electric Car price: " + eElement.getElementsByTagName("price").item(0).getTextContent());
                    //System.out.println("---------------------------------------------------------");
                    LOGGER.info("------------------------------------------------------------------");
                }
            }
            // Class3
            for(int i=0;i<nList.getLength();i++){
                Node nNode = nList3.item(i);
                //System.out.println("Node name " + nNode.getNodeName() + " " + (i+1));
                LOGGER.info("Node name " + nNode.getNodeName() + " " + (i+1));
                if(nNode.getNodeType()== Node.ELEMENT_NODE){
                    Element eElement = (Element) nNode;
                    //System.out.println("Car id: " + eElement.getAttribute("id"));
                    LOGGER.info("Gasoline Car id: " + eElement.getAttribute("id"));
                    //System.out.println("Car brand: " + eElement.getElementsByTagName("brand").item(0).getTextContent());
                    LOGGER.info("Gasoline Car brand: " + eElement.getElementsByTagName("brand").item(0).getTextContent());
                    //System.out.println("Car model: " + eElement.getElementsByTagName("model").item(0).getTextContent());
                    LOGGER.info("Gasoline Car model: " + eElement.getElementsByTagName("model").item(0).getTextContent());
                    //System.out.println("Car year: " + eElement.getElementsByTagName("year").item(0).getTextContent());
                    LOGGER.info("Gasoline Car fuel economy: " + eElement.getElementsByTagName("fuelEconomy").item(0).getTextContent());
                    //System.out.println("Car price: " + eElement.getElementsByTagName("price").item(0).getTextContent());
                    LOGGER.info("Gasoline Car price: " + eElement.getElementsByTagName("price").item(0).getTextContent());
                    //System.out.println("---------------------------------------------------------");
                    LOGGER.info("------------------------------------------------------------------");
                }
            }

            // Class4
            for(int i=0;i<nList.getLength();i++){
                Node nNode = nList4.item(i);
                //System.out.println("Node name " + nNode.getNodeName() + " " + (i+1));
                LOGGER.info("Node name " + nNode.getNodeName() + " " + (i+1));
                if(nNode.getNodeType()== Node.ELEMENT_NODE){
                    Element eElement = (Element) nNode;
                    //System.out.println("Car id: " + eElement.getAttribute("id"));
                    LOGGER.info("Sports Car id: " + eElement.getAttribute("id"));
                    //System.out.println("Car brand: " + eElement.getElementsByTagName("brand").item(0).getTextContent());
                    LOGGER.info("Sports Car brand: " + eElement.getElementsByTagName("brand").item(0).getTextContent());
                    //System.out.println("Car model: " + eElement.getElementsByTagName("model").item(0).getTextContent());
                    LOGGER.info("Sports Car model: " + eElement.getElementsByTagName("model").item(0).getTextContent());
                    //System.out.println("Car year: " + eElement.getElementsByTagName("year").item(0).getTextContent());
                    LOGGER.info("Sports Car top speed: " + eElement.getElementsByTagName("topSpeed").item(0).getTextContent());
                    //System.out.println("Car price: " + eElement.getElementsByTagName("price").item(0).getTextContent());
                    LOGGER.info("Sports Car price: " + eElement.getElementsByTagName("price").item(0).getTextContent());
                    //System.out.println("---------------------------------------------------------");
                    LOGGER.info("------------------------------------------------------------------");
                }
            }

            // Class5
            for(int i=0;i<nList.getLength();i++){
                Node nNode = nList5.item(i);
                //System.out.println("Node name " + nNode.getNodeName() + " " + (i+1));
                LOGGER.info("Node name " + nNode.getNodeName() + " " + (i+1));
                if(nNode.getNodeType()== Node.ELEMENT_NODE){
                    Element eElement = (Element) nNode;
                    //System.out.println("Car id: " + eElement.getAttribute("id"));
                    LOGGER.info("Used Car id: " + eElement.getAttribute("id"));
                    //System.out.println("Car brand: " + eElement.getElementsByTagName("brand").item(0).getTextContent());
                    LOGGER.info("Used Car brand: " + eElement.getElementsByTagName("brand").item(0).getTextContent());
                    //System.out.println("Car model: " + eElement.getElementsByTagName("model").item(0).getTextContent());
                    LOGGER.info("Used Car model: " + eElement.getElementsByTagName("model").item(0).getTextContent());
                    //System.out.println("Car year: " + eElement.getElementsByTagName("year").item(0).getTextContent());
                    LOGGER.info("Used Car mileage: " + eElement.getElementsByTagName("mileage").item(0).getTextContent());
                    //System.out.println("Car price: " + eElement.getElementsByTagName("price").item(0).getTextContent());
                    LOGGER.info("Used Car price: " + eElement.getElementsByTagName("price").item(0).getTextContent());
                    //System.out.println("---------------------------------------------------------");
                    LOGGER.info("------------------------------------------------------------------");
                }
            }



        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new RuntimeException(e);
        }

    }


}