package org.madalin.collections.maps;

import java.util.ArrayList;
import java.util.List;

public class InitFromDB {

    public void initFormDb(){
        List<String> tari=new ArrayList<>();
        tari.add("Albania");
        tari.add("Franta");
        tari.add("Romania");
        SimpleCache.putInCache("tari",tari);


        String[] sexe=new String[]{"Masculin","Feminin"};

        SimpleCache.putInCache("sex",sexe);

        SimpleCache.putInCache("admin_validation",Boolean.FALSE);
    }
}
