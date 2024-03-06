package com.dupackages_app_uae.dubalancecheck;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.applovin.mediation.ads.MaxAdView;

public class MainContent extends AppCompatActivity {

    Toolbar mainToolBar;

    // for custom dialog design
    EditText etEnterNumber;
    AppCompatButton btnSend, btnCancel;

    // button for dailyContent
    AppCompatButton btnDaily1, btnDaily2, btnDaily3, btnDaily4, btnDaily5;
    // button for yearlyContent
    AppCompatButton btnWeekly1, btnWeekly2;

    // button for monthlyContent
    AppCompatButton btnMonthly1, btnMonthly2, btnMonthly3, btnMonthly4, btnMonthly5;

    // button for careContent
    AppCompatButton btnCare, btnWebsiteLink;

    // button for topUp
    AppCompatButton btnTop1, btnTop2, btnTop3, btnTop4;

    // button for mainContent
    AppCompatButton btnMain1, btnMain2, btnMain3, btnMain4, btnMain5, btnMain6, btnMain7;
    // button for bundleContent
    AppCompatButton btnBundle1, btnBundle2, btnBundle3, btnBundle4, btnBundle5, btnBundle6, btnBundle7;

    // button for otherContent
    AppCompatButton btnOther1, btnOther2, btnOther3, btnOther4, btnOther5;
    LinearLayout lMain, lTopUp, lBundle, lFaq, lOther, lCare, lDaily, lYearly, lMonthly;

    MaxAdView maxBanner;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_content);
        // code for banner ads
        maxBanner = findViewById(R.id.maxBannerAd);
        maxBanner.setVisibility(View.VISIBLE);
        maxBanner.loadAd();

        // id for monthlyContent
        btnMonthly1 = findViewById(R.id.btn_monthly1);
        btnMonthly2 = findViewById(R.id.btn_monthly2);
        btnMonthly3 = findViewById(R.id.btn_monthly3);
        btnMonthly4 = findViewById(R.id.btn_monthly4);
        btnMonthly5 = findViewById(R.id.btn_monthly5);

        // id for topUp content
        btnTop1 = findViewById(R.id.btn_top1);
        btnTop2 = findViewById(R.id.btn_top2);
        btnTop3 = findViewById(R.id.btn_top3);
        btnTop4 = findViewById(R.id.btn_top4);

        // id for yearlyContent
        btnWeekly1 = findViewById(R.id.btn_weekly1);
        btnWeekly2 = findViewById(R.id.btn_weekly2);

        // id for dailyContent
        btnDaily1 = findViewById(R.id.btn_daily1);
        btnDaily2 = findViewById(R.id.btn_daily2);
        btnDaily3 = findViewById(R.id.btn_daily3);
        btnDaily4 = findViewById(R.id.btn_daily4);
        btnDaily5 = findViewById(R.id.btn_daily5);

        // id for careContent
        btnCare = findViewById(R.id.btn_care1);
        btnWebsiteLink = findViewById(R.id.btn_website_link);

        // id for otherContent
        btnOther1 = findViewById(R.id.btn_other1);
        btnOther2 = findViewById(R.id.btn_other2);
        btnOther3 = findViewById(R.id.btn_other3);
        btnOther4 = findViewById(R.id.btn_other4);
        btnOther5 = findViewById(R.id.btn_other5);

        // id for mainContent

        btnMain1 = findViewById(R.id.btn_main1);
        btnMain2 = findViewById(R.id.btn_main2);
        btnMain3 = findViewById(R.id.btn_main3);
        btnMain4 = findViewById(R.id.btn_main4);
        btnMain5 = findViewById(R.id.btn_main5);
        btnMain6 = findViewById(R.id.btn_main6);
        btnMain7 = findViewById(R.id.btn_main7);

        // id for mainContent

        btnBundle1 = findViewById(R.id.btn_bundle1);
        btnBundle2 = findViewById(R.id.btn_bundle2);
        btnBundle3 = findViewById(R.id.btn_bundle3);
        btnBundle4 = findViewById(R.id.btn_bundle4);
        btnBundle5 = findViewById(R.id.btn_bundle5);
        btnBundle6 = findViewById(R.id.btn_bundle6);
        btnBundle7 = findViewById(R.id.btn_bundle7);

        // id for home page
        lMain = findViewById(R.id.linear_main_content);
        lTopUp = findViewById(R.id.linear_top_content);
        lBundle = findViewById(R.id.linear_bundle_content);
        lFaq = findViewById(R.id.linear_faq_content);
        lOther = findViewById(R.id.linear_other_content);
        lCare = findViewById(R.id.linear_care_content);
        lDaily = findViewById(R.id.linear_daily_content);
        lYearly = findViewById(R.id.linear_yearly_content);
        lMonthly = findViewById(R.id.linear_monthly_content);

        int layoutContent = getIntent().getIntExtra("layoutContent", 1);


        mainToolBar = findViewById(R.id.toolbar_main);
        setSupportActionBar(mainToolBar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        }


        if (layoutContent == 1) {
            getSupportActionBar().setTitle("Details");
            lMain.setVisibility(View.VISIBLE);
        } else if (layoutContent == 2) {
            getSupportActionBar().setTitle("TOPUP");
            lTopUp.setVisibility(View.VISIBLE);
        } else if (layoutContent == 3) {
            getSupportActionBar().setTitle("Bundles");
            lBundle.setVisibility(View.VISIBLE);
        } else if (layoutContent == 4) {
            getSupportActionBar().setTitle("FAQS");
            lFaq.setVisibility(View.VISIBLE);
        } else if (layoutContent == 5) {
            getSupportActionBar().setTitle("Other");
            lOther.setVisibility(View.VISIBLE);
        } else if (layoutContent == 6) {
            getSupportActionBar().setTitle("Customer Care");
            lCare.setVisibility(View.VISIBLE);
        } else if (layoutContent == 7) {
            getSupportActionBar().setTitle("Daily Bundle");
            lDaily.setVisibility(View.VISIBLE);
        } else if (layoutContent == 8) {
            getSupportActionBar().setTitle("Yearly Bundle");
            lYearly.setVisibility(View.VISIBLE);
        } else {
            getSupportActionBar().setTitle("Monthly Bundle");
            lMonthly.setVisibility(View.VISIBLE);
        }
        // clickListener for buttonMainContent
        btnMain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("*135#");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        btnMain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("*055#");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        btnMain3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("*135#1#");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        btnMain4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("*102#");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        btnMain5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("*121#");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        btnMain6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", "9296", null));
                intent.putExtra("sms_body", "getmymsisdn");
                startActivity(intent);
            }
        });
        btnMain7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("*108#");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });

        // clickListener for bundleContent
        btnBundle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("*135*6#");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        btnBundle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("*222#");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        btnBundle3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("*135#");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        btnBundle4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("*135*3#");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        btnBundle5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("*135*5#");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        btnBundle6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("135");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        btnBundle7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("135");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        // clickListener for otherContent
        btnOther1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("*135*35#");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        btnOther2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("*135*50#");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        btnOther3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("*135*11#");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        btnOther4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("135");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        btnOther5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("156");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        // clickListener for careContent
        btnWebsiteLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.du.aenewcontactus/ ";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        btnCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("155");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        // clickListener for dailyContent
        btnDaily1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("*135*6#");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        btnDaily2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("*135*5#");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        btnDaily3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("*222#");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        btnDaily4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("*135#");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        btnDaily5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("*055*777#");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        // clickListener for yearlyContent
        btnWeekly1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("*135*1501#");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        btnWeekly2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("*135*1502#");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        // clickListener for monthlyContent
        btnMonthly1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("*055*777#");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        btnMonthly1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("*135*250#");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        btnMonthly2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("*055*167#");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        btnMonthly3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("*135*5#");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        btnMonthly4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("*135#5#1#");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        btnMonthly5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String uri = Uri.encode("*135*3#");
                i.setData(Uri.parse("tel:" + uri));
                startActivity(i);
            }
        });
        // clickListener for button topUp
        btnTop1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customDialog("135");
            }
        });
        btnTop2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customDialog("136");
            }
        });
        btnTop3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customDialog("138");
            }
        });
        btnTop4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customDialog("131");
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    void customDialog(String preCode) {
        Dialog dialog = new Dialog(MainContent.this);
        dialog.setContentView(R.layout.custom_dialog_top);
        dialog.setCancelable(false);
        etEnterNumber = dialog.findViewById(R.id.et_enter_number);
        btnSend = dialog.findViewById(R.id.btn_send);
        btnCancel = dialog.findViewById(R.id.btn_cancel);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etEnterNumber.getText().toString().isEmpty()) {
                    Toast.makeText(MainContent.this, "Please Enter the number", Toast.LENGTH_SHORT).show();
                } else {
                    String cardNum = etEnterNumber.getText().toString();
                    String fullCode = "*" + preCode + "*" + cardNum + "#";

                    Intent i = new Intent(Intent.ACTION_DIAL);
                    String uri = Uri.encode(fullCode);
                    i.setData(Uri.parse("tel:" + uri));
                    startActivity(i);

                    dialog.dismiss();
                }
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

}