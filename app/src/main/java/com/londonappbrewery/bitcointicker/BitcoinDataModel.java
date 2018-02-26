package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.DecimalFormat;

/**
 * Created by AMinz on 26-02-2018.
 */

public class BitcoinDataModel
{
    private double mLastPrice;

    public double getLastPrice() {
        return mLastPrice;
    }

    public void setLastPrice(double lastPrice) {
        mLastPrice = lastPrice;
    }

    public static BitcoinDataModel fromJSON(JSONObject jsonObject)
    {
        BitcoinDataModel bitcoin = new BitcoinDataModel();

        try {
            DecimalFormat decimalFormat = new DecimalFormat("##.00");
            bitcoin.mLastPrice = Double.parseDouble(jsonObject.getString("last"));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return bitcoin;
    }
}
