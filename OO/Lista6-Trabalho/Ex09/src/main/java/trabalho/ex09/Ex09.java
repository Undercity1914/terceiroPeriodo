/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package trabalho.ex09;

import trabalho.ex09.Classes.ArchiveLogStorage;
import trabalho.ex09.Classes.ConsoleLogStorage;
import trabalho.ex09.Classes.Services.LogServices;
import trabalho.ex09.Interface.ILogSorage;

/**
 *
 * @author marco
 */
public class Ex09 {

    public static void main(String[] args) {
        ILogSorage archiveLog = new ArchiveLogStorage();
        ILogSorage consoleLog = new ConsoleLogStorage();
        
        LogServices archive = new LogServices(archiveLog);
        LogServices console =  new LogServices(consoleLog);
        
        archive.logRegister("Sou o Marcos!");
        console.logRegister("Sou o Vinicius!");
    }
}
