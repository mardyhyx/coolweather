package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by mardy on 2018/6/14.
 */

public class Province extends DataSupport {

    private int id;
    private String province;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public String getProvince() {
        return province;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
