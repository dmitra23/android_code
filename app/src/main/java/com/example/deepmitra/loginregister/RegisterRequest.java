package com.example.deepmitra.loginregister;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Deep mitra on 3/29/2017.
 */

public class RegisterRequest extends StringRequest {
    public static final String REG_REQUEST_URL = "http://projectandroidapp.000webhostapp.com/register.php";
    private Map<String,String> params;

    public RegisterRequest(String name, String username, String password, String address, Response.Listener<String> listener){
        super(Method.POST, REG_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("username", username);
        params.put("password", password);
        params.put("address", address);
   }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
