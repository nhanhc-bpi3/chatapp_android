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
                    "Authorization:key=AAAAPGNmY1I:APA91bGoh07jCsJtQANnMlqohiujVNJCZqc0-xMqQ8C0_azT_e2fV9pNHNSuuq1PHMASS24kxTo9DlrNkj2tNNU4fPtY3ycfbgApRHIfJbhH1zUZDgtnKnLipGBDjXX_4dY8LpOehRHB"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
