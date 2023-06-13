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

public class CarXmlParserRunner {
    public static void main(String[] args) {
        // reading xml documents using DOM
        // Java DOM parser: parses xml document by loading
        // the complete contents of the document and creating its complete hierarchical
        // tree in memory
        try {
            File xmlDoc = new File("src/main/java/com/solvd/laba/xmlparser/cars.xml");
            //File xmlDoc1 = new File("src/main/java/com/laba/xmlparser/electricCar.xml");
            DocumentBuilderFactory dbFact = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuild = dbFact.newDocumentBuilder();
            Document doc = dbBuild.parse(xmlDoc);
            //Document doc1 = dbBuild.parse(xmlDoc1);

            NodeList nList = doc.getElementsByTagName("car");
            //NodeList nList1 = doc1.getElementsByTagName("electricCars");

            // Read the xml document

            for(int i=0;i<nList.getLength();i++){
                Node nNode = nList.item(i);
                System.out.println("Node name " + nNode.getNodeName() + " " + (i+1));
                if(nNode.getNodeType()== Node.ELEMENT_NODE){
                    Element eElement = (Element) nNode;
                    System.out.println("Car id: " + eElement.getAttribute("id"));
                    System.out.println("Car brand: " +
                            eElement.getElementsByTagName("brand").item(0).getTextContent());
                    System.out.println("Car model: " +
                            eElement.getElementsByTagName("model").item(0).getTextContent());
                    System.out.println("Car year: " +
                            eElement.getElementsByTagName("year").item(0).getTextContent());
                    System.out.println("Car price: " +
                            eElement.getElementsByTagName("price").item(0).getTextContent());
                    System.out.println("---------------------------------------------------------");
                }

            }
            System.out.println("-----------------------------------------");


        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new RuntimeException(e);
        }

    }


}
            /*for(int i=0;i<nList1.getLength();i++){
                Node nNode = nList1.item(i);
                System.out.println("Node name " + nNode.getNodeName() + " " + (i+1));
                if(nNode.getNodeType()== Node.ELEMENT_NODE){
                    Element eElement = (Element) nNode;
                    System.out.println("Electric car id: " + eElement.getAttribute("id"));
                    System.out.println("Electric car brand: " +
                            eElement.getElementsByTagName("brand").item(0).getTextContent());
                    System.out.println("Electric car model: " +
                            eElement.getElementsByTagName("model").item(0).getTextContent());
                    System.out.println("Electric car battery capacity: " +
                            eElement.getElementsByTagName("batteryCapacity").item(0).getTextContent());
                    System.out.println("Electric car price: " +
                            eElement.getElementsByTagName("price").item(0).getTextContent());
                    System.out.println("---------------------------------------------------------");
                }

            }*/



        /*try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            DocumentBuilder builder = factory.newDocumentBuilder();

            // Get document
            Document document = builder.parse(new File("src/main/java/com/solvd/laba/cars.xml"));

            // Normalize the xml structure
            document.getDocumentElement().normalize();

            // get the elements
            NodeList carList = document.getElementsByTagName("car");
            for(int i = 0; i < carList.getLength(); i++){
                Node car = carList.item(i); // we will get the node

                //information about particular Node
                if(car.getNodeType() == Node.ELEMENT_NODE){
                    Element carElement = (Element) car;
                    System.out.println("Car id= " + carElement.getAttribute("car id"));

                    // Getting all the details of particular car
                    NodeList carDetails = car.getChildNodes();
                    for(int j = 0; j < carDetails.getLength(); j++){
                        Node detail = carDetails.item(j);
                        if(detail.getNodeType() == Node.ELEMENT_NODE) {
                            Element detailElement = (Element) detail;
                            System.out.println("    " + detailElement.getTagName() + "= " + detailElement.getAttribute("element"));
                        }
                    }
                }


            }

        } catch (ParserConfigurationException | SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}*/
        /*SchemaFactory sFactoryfactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema carSchema = sFactoryfactory.newSchema(new File(XCD_FILE));
        Validator validator = carSchema.newValidator();
        validator.validate(new StreamSource(new File(XML_FILE)));

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new File(XML_FILE));
        System.out.println(doc.getFirstChild().getNodeName());

    }
    }*/