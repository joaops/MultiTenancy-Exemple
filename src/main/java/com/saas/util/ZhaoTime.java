package com.saas.util;

import java.sql.Date;

public class ZhaoTime {
    
    /**
     * Obtém a data atual, os dados podem ser gravados no formato de mysql (AAAA- MM -DD)
     * @return a data atual
     */
    public static Date getCurrentDate(){
        return new Date(new java.util.Date().getTime());
    }
    
}