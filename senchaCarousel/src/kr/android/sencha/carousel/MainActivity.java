package kr.android.sencha.carousel;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	
	WebView wvWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        wvWeb = (WebView)findViewById(R.id.wvWeb);
        //웹 뷰사용시 자바스크립트 사용하므로 명시
        wvWeb.getSettings().setJavaScriptEnabled(true);
        
    
        
        //로컬 데이터를 읽어올 때
        wvWeb.loadUrl("file:///android_asset/www/index.html");
        
        
        wvWeb.setWebViewClient(new WebViewClient(){
        	
        	@Override
        	public boolean shouldOverrideUrlLoading(WebView view, String url){
        		//링크를 클릭했을 때 이벤트 처리
            	view.loadUrl(url);
            	return true;
        	}
        	
        });

    }
    
        
    public boolean onKeyDown(int keyCode, KeyEvent event){
    	if(keyCode==KeyEvent.KEYCODE_BACK && wvWeb.canGoBack()){
    		wvWeb.goBack();
    	}else if(keyCode==KeyEvent.KEYCODE_BACK && !wvWeb.canGoBack()){
    		Toast.makeText(this,  "프로그램 종료", Toast.LENGTH_SHORT).show();
    		
    		finish();
    		
    	}
    	return true;
    }


}
