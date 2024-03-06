package com.dupackages_app_uae.dubalancecheck;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.onesignal.OneSignal;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    LinearLayout lMain, lTopUp, lBundle, lFaq, lOther, lCare, lDaily, lYearly, lMonthly;
    Toolbar toolbar;
    MaxAdView maxBanner;
    Button btnDetail;

    private MaxInterstitialAd interstitialAd;
    private int retryAttempt;
    int counterFlag = 0;
    // for one signal ID
    private static final String ONESIGNAL_APP_ID = "79394d73-bcba-4a88-9bc2-f8a8e2e789da";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnDetail = findViewById(R.id.btn_detail);

        lMain = findViewById(R.id.linear_main);
        lTopUp = findViewById(R.id.linear_top_up);
        lBundle = findViewById(R.id.linear_bundle);
        lFaq = findViewById(R.id.linear_faq);
        lOther = findViewById(R.id.linear_other);
        lCare = findViewById(R.id.linear_care);
        lDaily = findViewById(R.id.linear_daily);
        lYearly = findViewById(R.id.linear_yearly);
        lMonthly = findViewById(R.id.linear_monthly);

        toolbar = findViewById(R.id.toolbar_balance);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("du Balance Check");

        createInterstitialAd();
        AppLovinSdk.getInstance(this).setMediationProvider("max");
        AppLovinSdk.initializeSdk(this, new AppLovinSdk.SdkInitializationListener() {
            @Override
            public void onSdkInitialized(final AppLovinSdkConfiguration configuration) {
                // Applovin SDK is initialized, start loading ads
                AppLovinSdk.getInstance(MainActivity.this).showMediationDebugger();
            }
        });
        lMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counterFlag == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    counterFlag = 0;
                } else {
                    counterFlag++;
                }

                Intent intent = new Intent(MainActivity.this, MainContent.class);
                intent.putExtra("layoutContent", 1);
                startActivity(intent);
            }
        });
        lTopUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainContent.class);
                intent.putExtra("layoutContent", 2);
                startActivity(intent);
            }
        });
        lBundle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counterFlag == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    counterFlag = 0;
                } else {
                    counterFlag++;
                }

                Intent intent = new Intent(MainActivity.this, MainContent.class);
                intent.putExtra("layoutContent", 3);
                startActivity(intent);
            }
        });
        lFaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counterFlag == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    counterFlag = 0;
                } else {
                    counterFlag++;
                }
                Intent intent = new Intent(MainActivity.this, MainContent.class);
                intent.putExtra("layoutContent", 4);

                startActivity(intent);
            }
        });
        lOther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counterFlag == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    counterFlag = 0;
                } else {
                    counterFlag++;
                }
                Intent intent = new Intent(MainActivity.this, MainContent.class);
                intent.putExtra("layoutContent", 5);

                startActivity(intent);
            }
        });
        lCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counterFlag == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    counterFlag = 0;
                } else {
                    counterFlag++;
                }
                Intent intent = new Intent(MainActivity.this, MainContent.class);
                intent.putExtra("layoutContent", 6);

                startActivity(intent);
            }
        });
        lDaily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counterFlag == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    counterFlag = 0;
                } else {
                    counterFlag++;
                }
                Intent intent = new Intent(MainActivity.this, MainContent.class);
                intent.putExtra("layoutContent", 7);

                startActivity(intent);
            }
        });
        lYearly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counterFlag == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    counterFlag = 0;
                } else {
                    counterFlag++;
                }
                Intent intent = new Intent(MainActivity.this, MainContent.class);
                intent.putExtra("layoutContent", 8);

                startActivity(intent);
            }
        });
        lMonthly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counterFlag == 1) {
                    if (interstitialAd.isReady()) {
                        interstitialAd.showAd();
                    }
                    counterFlag = 0;
                } else {
                    counterFlag++;
                }
                Intent intent = new Intent(MainActivity.this, MainContent.class);
                intent.putExtra("layoutContent", 9);
                startActivity(intent);
            }
        });
        // code for btnDetail
        btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "https://planspapa.com/du-international-voice-plans/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        // call method for one signal
        oneSignal();

        // code for banner ads
        maxBanner = findViewById(R.id.maxBannerAd);
        maxBanner.setVisibility(View.VISIBLE);
        maxBanner.loadAd();

        AppLovinSdk.getInstance(this).setMediationProvider("max");
        AppLovinSdk.initializeSdk(this, new AppLovinSdk.SdkInitializationListener() {
            @Override
            public void onSdkInitialized(final AppLovinSdkConfiguration configuration) {
                // Applovin SDK is initialized, start loading ads
                AppLovinSdk.getInstance(MainActivity.this).showMediationDebugger();
            }
        });

    }

    //  code for Interstitial Ads
    void createInterstitialAd() {
        interstitialAd = new MaxInterstitialAd("e65168ca79401400", this);
        interstitialAd.setListener(new MaxAdListener() {
            // MAX Ad Listener
            @Override
            public void onAdLoaded(final MaxAd maxAd) {
                // Interstitial ad is ready to be shown. interstitialAd.isReady() will now return 'true'

                // Reset retry attempt
                retryAttempt = 0;
            }

            @Override
            public void onAdLoadFailed(final String adUnitId, final MaxError error) {
                // Interstitial ad failed to load
                // AppLovin recommends that you retry with exponentially higher delays up to a maximum delay (in this case 64 seconds)

                retryAttempt++;
                long delayMillis = TimeUnit.SECONDS.toMillis((long) Math.pow(2, Math.min(6, retryAttempt)));

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        interstitialAd.loadAd();
                    }
                }, delayMillis);
            }

            @Override
            public void onAdDisplayFailed(final MaxAd maxAd, final MaxError error) {
                // Interstitial ad failed to display. AppLovin recommends that you load the next ad.
                interstitialAd.loadAd();
            }

            @Override
            public void onAdDisplayed(final MaxAd maxAd) {
            }

            @Override
            public void onAdClicked(final MaxAd maxAd) {
            }

            @Override
            public void onAdHidden(final MaxAd maxAd) {

                interstitialAd.loadAd();
            }
        });

        // Load the first ad
        interstitialAd.loadAd();
    }

    public void oneSignal() {
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);

    }

    // method for alertDialog
    private void alertDialog() {
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
                .setCancelable(false)
                .setTitle("EXIT")
                .setIcon(R.drawable.baseline_exit_to_app_24)
                .setMessage("Are You want to Exit it")

                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();

                    }
                })
                .create();
        alertDialog.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_loan, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // method for click on menu item
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.loan_menu_share) {
            shareAppLink();
        } else if (itemId == R.id.loan_menu_Rate) {
            rateOurApp();
        } else if (itemId == R.id.loan_menu_More) {
            moreOurApp();
        } else {
            alertDialog();

        }
        return super.onOptionsItemSelected(item);
    }


    // Option --> share app
    private void shareAppLink() {
        Intent myIntent = new Intent(Intent.ACTION_SEND);
        myIntent.setType("text/plain");
        String body = "https://play.google.com/store/apps/details?id=" + getPackageName();
        String sub = "Your Subject";
        myIntent.putExtra(Intent.EXTRA_SUBJECT, sub);
        myIntent.putExtra(Intent.EXTRA_TEXT, body);
        startActivity(Intent.createChooser(myIntent, "Share Using"));
    }

    // Option --> Rate our app
    private void rateOurApp() {
        try {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("market://details?id=" + getPackageName())));
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/details?id=" + getPackageName())));
        }
    }

    // Option --> More app
    private void moreOurApp() {
        try {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("market://search?q=pub:" + "Codingkey")));
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/developer?id=Codingkey")));

        }
    }


    @Override
    public void onBackPressed() {
        alertDialog();
    }
}