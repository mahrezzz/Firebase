package com.barin.firebasefundementals;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by huseyinbarin on 1/20/17.
 */

public class BaseActivity extends AppCompatActivity {

  private ProgressDialog mProgressDialog;

  public void showProgressDialog(String message) {
    if (mProgressDialog == null) {
      mProgressDialog = new ProgressDialog(this);
      mProgressDialog.setCancelable(false);
      mProgressDialog.setMessage(message);
    }

    mProgressDialog.show();
  }

  public void hideProgressDialog() {
    if (mProgressDialog != null && mProgressDialog.isShowing()) {
      mProgressDialog.dismiss();
    }
  }

  public String getUid() {
    return FirebaseAuth.getInstance().getCurrentUser().getUid();
  }
}
