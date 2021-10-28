package fpt.edu.chatapp.Fragments;

import fpt.edu.chatapp.Notifications.MyResponse;
import fpt.edu.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAo0tGZlQ:APA91bEAlxXrepSPMWV6qjYSyW1U722CSeRb4yfF4E1ZcQ4bm2lBFBVLQTngdgwqrPeiWsV_1fwwMMmJGZR8kO6XZNMTemHNboqln3L8GBP1ovkJuq9syPlPFKmxv5AUOyimL6N-UCok"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
