/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app.utils;

import java.io.Serializable;
import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author Lalime
 */

@ManagedBean 
@SessionScoped 
public class ChangeLocale implements Serializable{ 

  private String locale="fr"; 


  public ChangeLocale() { 

  } 

 

  public String getLocale() { 

    return locale; 

  } 

   

} 
