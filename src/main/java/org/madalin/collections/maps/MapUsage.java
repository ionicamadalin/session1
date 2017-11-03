package org.madalin.collections.maps;

import java.util.ArrayList;
import java.util.List;

public class MapUsage {

    public static void main(String[] args) {
       InitFromDB initFromDB=new InitFromDB();
       initFromDB.initFormDb();

        if(Boolean.TRUE.equals(SimpleCache.getFrom("admin_validation"))){
            for (String o : (List<String>)SimpleCache.getFrom("tari")) {
                System.out.println(o);
            }
        }




    }
}
