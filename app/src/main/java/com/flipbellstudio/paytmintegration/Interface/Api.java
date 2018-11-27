package com.flipbellstudio.paytmintegration.Interface;

import com.flipbellstudio.paytmintegration.Model.Paypal;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {

    public static String BASE_URL = "http://your URL/android/quiz/paytm/"; //Enter Your URL

    @FormUrlEncoded
    @POST("generateChecksum.php")
    abstract Call<Paypal> getChecksum(
            @Field("MID") String mId,
            @Field("ORDER_ID") String orderId,
            @Field("CUST_ID") String custId,
            @Field("CHANNEL_ID") String channelId,
            @Field("TXN_AMOUNT") String txnAmount,
            @Field("WEBSITE") String website,
            @Field("CALLBACK_URL") String callbackUrl,
            @Field("INDUSTRY_TYPE_ID") String industryTypeId
    );
}
