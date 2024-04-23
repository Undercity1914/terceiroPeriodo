/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;
import javax.xml.bind.JAXBContext;
import Manager.MusicManagement;
import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author marco
 */
public class XMLSerializer 
{
    public MusicManagement fromXML(String xmlString)
    {
        try{
            JAXBContext context = JAXBContext.newInstance(MusicManagement.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            StringReader reader = new StringReader(xmlString);
            
            return (MusicManagement) unmarshaller.unmarshal(reader);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public String toXML(MusicManagement manager)
    {
        try{
            JAXBContext context = JAXBContext.newInstance(MusicManagement.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            StringWriter writer = new StringWriter();
            marshaller.marshal(manager, writer);
            return writer.toString();
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
