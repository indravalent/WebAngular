package com.indravalent.webviewangular;

import android.content.Intent;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class WebAppInterface {
    private MainActivity mainActivity;

    public WebAppInterface(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }
    @JavascriptInterface
    public void showNotification(String title, String message) {
        // Implement your notification logic here
        Toast.makeText(mainActivity, "halo " + title + ", saya indra valent " + message, Toast.LENGTH_SHORT).show();
    }

    @JavascriptInterface
    public void showCall() {
        // Implement your phone call logic here
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"));
        mainActivity.startActivity(intent);
    }

    @JavascriptInterface
    public void showWhatsApp() {
        // Implement your WhatsApp logic here
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://api.whatsapp.com/send?phone=628123456789"));
        mainActivity.startActivity(intent);
    }

    @JavascriptInterface
    public void showCamera() {
        // Implement your camera logic here
        Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        mainActivity.startActivity(intent);
    }

}
