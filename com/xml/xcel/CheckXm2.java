package com.xml.xcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class CheckXm2 {

public void POIExcelReader(){
}


public void displayFromExcel (String xlsPath)
{
    InputStream inputStream = null; 
    try
    {
        inputStream = new FileInputStream (xlsPath);
    }
    catch (FileNotFoundException e)
    {
        System.out.println ("File not found in the specified path.");
        e.printStackTrace ();
    }

    //POIFSFileSystem fileSystem = null;

    try {
        //Initializing the XML document
    	//Creating an XML Document
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();
        Element rootElement = document.createElement("data");
        document.appendChild(rootElement);

        Workbook workbook = null;
        //fileSystem = new POIFSFileSystem (inputStream);
        if (xlsPath.endsWith("xlsx")) {
            workbook = new XSSFWorkbook(inputStream);
        } else if (xlsPath.endsWith("xls")) {
            workbook = new HSSFWorkbook(inputStream);
        } else {
            throw new IllegalArgumentException("The specified file is not Excel file");
        }
        //HSSFWorkbook      workBook = new HSSFWorkbook (fileSystem);
        Sheet sheet    = workbook.getSheetAt(0); 
        Iterator<Row> iterator     = sheet.iterator();

        ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
       
       // System.out.println(data);
        
        while (iterator.hasNext ()) 
        {
            Row row = iterator.next();

            int rowNumber = row.getRowNum ();
            // display row number
           // System.out.println ("Row No.: " + rowNumber);

            // get a row, iterate through cells.
            Iterator<Cell> cells = row.cellIterator (); 
            ArrayList<String> rowData = new ArrayList<String>();
            
            while (cells.hasNext())
            {
                Cell cell = cells.next ();
               //System.out.println ("Cell : " + cell.getCellNum ());
                switch (cell.getCellType ())
                {
                case Cell.CELL_TYPE_NUMERIC :
                {
                    // NUMERIC CELL TYPE
                   // System.out.println ("Numeric: " + cell.getNumericCellValue ());
                    rowData.add(cell.getNumericCellValue () + "");
                    break;
                }
                case Cell.CELL_TYPE_STRING :

                {
                    // STRING CELL TYPE
                    RichTextString richTextString = cell.getRichStringCellValue ();

                   // System.out.println ("String: " + richTextString.getString ());
                    rowData.add(richTextString.getString ());
                    break;
                }
                default:
                {
                    // types other than String and Numeric.
                  //  System.out.println (cell.getCellTypeEnum());
                    rowData.add(cell.getStringCellValue());
                    break;
                }
                } // end switch

            } // end while
            data.add(rowData);


            
            
        } //end while
      //  System.out.println(data);
        int numOfProduct = data.size();
        ArrayList<ArrayList<String>> namesrow= new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> corpID= new ArrayList<ArrayList<String>>();
        for (int i = 1; i <numOfProduct; i++){
        	
        	ArrayList<String> innerrow=new ArrayList<String>();
        	ArrayList<String> innercorpID=new ArrayList<String>();
        	//innerrow.add(data.get(i).get(3));
        	/*for(int ii=0;ii<data.get(i).get(3).length();ii++)
        	{
        		String[] temp=
        	}*/
        	//innerrow.add(data.get(i).get(3));
        	//System.out.println(data.get(i).get(3).toString());
        	//System.out.println("*******");
        	String temp[]=data.get(i).get(3).toString().split("\\)");
        	System.out.println(temp.length);
        	for(int ii=0;ii<temp.length;i++){
        		String temptemp[]=temp[ii].split("\\(");
        		innerrow.add(temptemp[0]);
        		innercorpID.add(temptemp[1]);
        	}
        	//System.out.println(temp[0]);
        	//System.out.println(temp[1]);
        	//System.out.println(temp[2]);
        
        	//String
        	//System.out.println(innerrow.size());
        	//System.out.println(innerrow);
        	//System.out.println(innerrow.get(1));
        	namesrow.add(innerrow);
        	corpID.add(innercorpID);
        	
        	}
        
        
        
        System.out.println(namesrow);
        System.out.println("==");
        System.out.println(corpID);
        //System.out.println(namesrow);
        //int numOfProduct = data.size();
         //System.out.println("datasize"+ numOfProduct);

        for (int i = 1; i <numOfProduct; i++){
            //Element productElement = document.createElement("Detail");
            //System.out.println("product element" + productElement);
            //rootElement.appendChild(productElement);
        	//System.out.println("rowData->" + rowData.get(i));
        	String temp= data.get(i).get(0);
           // System.out.println("temp->"+temp);
            
            Element mainelement = document.createElement("Award");
        	
            if(!temp.isEmpty()){
            
        	   rootElement.appendChild(mainelement);
            
            		   Element subElement = document.createElement("Names");
            		   
            		   Element subNameElement= document.createElement(data.get(0).get(4));
            		   Element subCorpElement=document.createElement(data.get(0).get(5));
            		   Element subRolesElement=document.createElement(data.get(0).get(6));
            		   
            		   mainelement.appendChild(subElement);
            		   subElement.appendChild(subNameElement);
            		   subElement.appendChild(subCorpElement);
            		   subElement.appendChild(subRolesElement);
            		   
            		   
            		   subNameElement.appendChild(document.createTextNode(data.get(i).get(4)));
            		   subCorpElement.appendChild(document.createTextNode(data.get(i).get(5)));
            		   subRolesElement.appendChild(document.createTextNode(data.get(i).get(6)));
            		   
            		   //Element subElementColoumns = document.createElement("Names");
            		   int index= 0;
            		   for(String s: data.get(i))
            		   {
            			   
            			   String headerString = data.get(0).get(index);
                           
                           
                            
            			   //System.out.println("header string-->"+ headerString);
                           Element headerElement = document.createElement(headerString);
                           mainelement.appendChild(headerElement);
                           headerElement.appendChild(document.createTextNode(s));
                           index++;
                           
                           
            		   }
            		  // }
            	
            	   
               }
        }
        	
        	
           // }
        //}

        TransformerFactory tFactory = TransformerFactory.newInstance();

        Transformer transformer = tFactory.newTransformer();
        //Add indentation to output
        DOMSource source = new DOMSource(document);
       /// StreamResult result = new StreamResult(new File("D://award.xml"));
        //transformer.setOutputProperty
        //(OutputKeys.INDENT, "yes");
        //transformer.setOutputProperty(
          //      "{http://xml.apache.org/xslt}indent-amount", "2");
        //transformer.transform(source, result);
        //StreamResult consoleresult = new StreamResult(System.out);
        //transformer.transform(source, consoleresult);
       
    }
    catch(IOException e)
    {
        System.out.println("IOException " + e.getMessage());
    } catch (ParserConfigurationException e) {
        System.out.println("ParserConfigurationException " + e.getMessage());
    } catch (TransformerConfigurationException e) {
        System.out.println("TransformerConfigurationException "+ e.getMessage());
    } catch (TransformerException e) {
        System.out.println("TransformerException " + e.getMessage());
    }
}


public static void main (String[] args)
{
    CheckXm2 poiExample = new CheckXm2 ();
    String xlsPath ="D:\\award.xlsx";
    poiExample.displayFromExcel (xlsPath);
}
}

