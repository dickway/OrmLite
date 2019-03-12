package com.ydy.weidong.ormlite;

import android.content.Context;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.List;

public class ChargeDao {
    Dao<Charge, Integer> chargeIntegerDao;
    DatabaseHelper helper;

    public ChargeDao(Context context) {
        try {
            helper = DatabaseHelper.getHelper(context);
            chargeIntegerDao = helper.getDao(Charge.class);
            if (chargeIntegerDao == null) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void addCharge(Charge charge) {
        try {
            chargeIntegerDao.create(charge);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Charge> queryAll() {
        try {
            return chargeIntegerDao.queryForAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
