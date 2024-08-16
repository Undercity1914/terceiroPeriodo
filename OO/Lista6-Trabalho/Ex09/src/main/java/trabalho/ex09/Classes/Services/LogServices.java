/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.ex09.Classes.Services;

import trabalho.ex09.Interface.ILogSorage;

/**
 *
 * @author marco
 */
public class LogServices 
{
    ILogSorage logStorage;

    public LogServices(ILogSorage logStorage) {
        this.logStorage = logStorage;
    }
    
    public void logRegister(String massage)
    {
        logStorage.file(massage);
    }
}
