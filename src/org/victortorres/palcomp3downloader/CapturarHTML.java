/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.victortorres.palcomp3downloader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor (Revisão: Luís)
 */

public class CapturarHTML {
    
    public String capturar(URL endereco) throws IOException {
        String linha;
        StringBuilder retorno = new StringBuilder();
        try {  
            URL url = new URL(""+endereco);  
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));  
            
            while ((linha = in.readLine()) != null) {  
                retorno.append(linha);
            }
            
            in.close();  
        } catch (MalformedURLException e) {  
            JOptionPane.showMessageDialog(null, "Erro: "+e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {  
            JOptionPane.showMessageDialog(null, "Erro: "+e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }        
        return retorno.toString(); 
    } 
}
