package com.example.apple.recycleviewtest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.android.imageloadercompact.CompactImageView;
import com.android.imageloadercompact.ImageLoaderCompact;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MessageAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Message> mMessages = new ArrayList<>();
    private int[] mUsernameColors;
    String path1 ="http://mp1.jmstatic.com/c_zoom,w_1080,q_70//jmstore/image/000/002/2034_std/5705cc98ae83c_1024_512.jpg?1462759494";
    String path3 ="http://mp1.jmstatic.com/c_zoom,w_756,q_70/product/001/744/1744578_std/1744578_dx_800_400.jpg?_t=1439891786";
    String path2 ="http://f3.jmstatic.com/static_account/dist/20160509/images/icons/android/home_default_backgroud.png";
    String path4 ="http://mp1.jmstatic.com/c_zoom,w_756,q_70/product/002/648/2648424_std/2648424_dx_800_400.jpg?_t=1463054313";
    String path5 ="http://mp1.jmstatic.com/c_zoom,w_756,q_70/product/000/985/985454_std/985454_dx_800_400.jpg?_t=1463054358";

    String path6 ="http://mp1.jmstatic.com/c_zoom,w_1080,q_70//jmstore/image/000/001/1433_std/573311b297d98_2048_1024.jpg?1463047098";
    String path7 ="http://mp1.jmstatic.com/c_zoom,w_1080,q_70//jmstore/image/000/001/1433_std/5733dc9aa78e0_2048_1024.jpg?1463024989";
    String path8 ="http://mp1.jmstatic.com/c_zoom,w_1080,q_70//jmstore/image/000/001/1877_std/57329e742d1f1_2048_1024.jpg?1463104879";
    String path9 ="http://mp1.jmstatic.com/c_zoom,w_1080,q_70//jmstore/image/000/001/1941_std/5733dde7e0a51_2048_1024.jpg?1463134500";
    String path10 ="http://mp1.jmstatic.com/c_zoom,w_1080,q_70//jmstore/image/000/002/2040_std/572d8bfc74078_2048_1024.jpg?1462863113";

    String[] paths = new String[]{path1,path2,path3,path4,path5,path6,path7,path8,path9,path10};

    private Context mContext;


    public MessageAdapter(Context context) {
        this.mContext =context;
        //type==1
        Random random =new Random();
        for (int i = 0; i <7 ; i++) {
            Message msg = new Message();
            msg.type=1;
            msg.path= paths[i];
//            msg.path =paths[random.nextInt(9)];
            mMessages.add(msg);
        }
        //type==2
        for (int i = 0; i <10 ; i++) {
            Message msg = new Message();
            msg.type=2;
            msg.path= paths[i];
//            msg.path =paths[random.nextInt(9)];
            mMessages.add(msg);
        }



        //type==4
        for (int i = 0; i <10 ; i++) {
            Message msg = new Message();
            msg.type=4;
            msg.path= paths[i];
//            msg.path =paths[random.nextInt(9)];
            mMessages.add(msg);
        }

        //type==3
        for (int i = 0; i <10 ; i++) {
            Message msg = new Message();
            msg.type=3;
            msg.path= paths[i];
//            msg.path =paths[random.nextInt(9)];
            mMessages.add(msg);
        }

        //type==5
        for (int i = 0; i <10 ; i++) {
            Message msg = new Message();
            msg.type=6;
            msg.path= paths[i];
//            msg.path =paths[random.nextInt(9)];
            mMessages.add(msg);
        }

        //type==5
        for (int i = 0; i <10 ; i++) {
            Message msg = new Message();
            msg.type=5;
            msg.path= paths[i];
//            msg.path =paths[random.nextInt(9)];
            mMessages.add(msg);
        }



        //type==5
        for (int i = 0; i <10 ; i++) {
            Message msg = new Message();
            msg.type=7;
            msg.path= paths[i];
//            msg.path =paths[random.nextInt(9)];
            mMessages.add(msg);
        }


        //type==4
        for (int i = 0; i <10 ; i++) {
            Message msg = new Message();
            msg.type=4;
            msg.path= paths[i];
//            msg.path =paths[random.nextInt(9)];
            mMessages.add(msg);
        }

        //type==3
        for (int i = 0; i <10 ; i++) {
            Message msg = new Message();
            msg.type=3;
            msg.path= paths[i];
//            msg.path =paths[random.nextInt(9)];
            mMessages.add(msg);
        }

        //type==5
//        for (int i = 0; i <50 ; i++) {
//            Message msg = new Message();
//            msg.type=random.nextInt(6)+1;
//            msg.path =paths[random.nextInt(9)];
//            mMessages.add(msg);
//        }
    }


    int onCreateViewHolder =0;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder holer = null;
        onCreateViewHolder++;
        Log.d("onCreateViewHolder =" ,onCreateViewHolder+"");
        View view = null;
        switch (viewType) {
            case 1:
                view = View.inflate(parent.getContext(), R.layout.adapter_layou1, null);
                holer =new ViewHolder1(view);
                break;
            case 2:
                view = View.inflate(parent.getContext(), R.layout.adapter_layou2, null);
                holer =new ViewHolder2(view);
                break;
            case 3:
                view = View.inflate(parent.getContext(), R.layout.adapter_layou3, null);
                holer =new ViewHolder3(view);
                break;
            case 4:
                view = View.inflate(parent.getContext(), R.layout.adapter_layou4, null);
                holer =new ViewHolder4(view);
                break;
            case 5:
                view = View.inflate(parent.getContext(), R.layout.adapter_layou5, null);
                holer =new ViewHolder5(view);
                break;
            case 6:
                view = View.inflate(parent.getContext(), R.layout.adapter_layou6, null);
                holer =new ViewHolder6(view);
                break;
            case 7:
                view = View.inflate(parent.getContext(), R.layout.adapter_layou7, null);
                holer =new ViewHolder7(view);
                break;
        }

        return holer;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Message message = mMessages.get(position);
        switch (message.type) {
            case 1:
                ImageLoaderCompact.getInstance().displayImage(message.path,((ViewHolder6)holder).image1);
                break;
            case 2:
                ImageLoaderCompact.getInstance().displayImage(message.path,((ViewHolder6)holder).image1);
                break;
            case 3:
                ImageLoaderCompact.getInstance().displayImage(message.path,((ViewHolder6)holder).image1);

                break;
            case 4:
                ImageLoaderCompact.getInstance().displayImage(message.path,((ViewHolder6)holder).image1);
                ImageLoaderCompact.getInstance().displayImage(message.path,((ViewHolder6)holder).image2);
//                Picasso.with(mContext).load(message.path).into(((ViewHolder4)holder).image1);
//                Picasso.with(mContext).load(message.path).into(((ViewHolder4)holder).image2);
                break;
            case 5:
                break;
            case 6:
                ImageLoaderCompact.getInstance().displayImage(message.path,((ViewHolder6)holder).image1);
                ImageLoaderCompact.getInstance().displayImage(message.path,((ViewHolder6)holder).image2);
//                Picasso.with(mContext).load(message.path).into(((ViewHolder6)holder).image1);
//                Picasso.with(mContext).load(message.path).into(((ViewHolder6)holder).image2);
                break;
            case 7:
                break;

        }
    }


    @Override
    public int getItemCount() {
        return mMessages.size();
    }

    @Override
    public int getItemViewType(int position) {
        return mMessages.get(position).type;
    }

    int count =0;
    public class ViewHolder1 extends RecyclerView.ViewHolder {
        private CompactImageView image1;

        public ViewHolder1(View itemView) {
            super(itemView);
            count++;
            Log.d("总创建对象",count+"");
            Log.d("当前type =","1");
            image1 = (CompactImageView) itemView.findViewById(R.id.image);
        }
    }

    public class ViewHolder2 extends RecyclerView.ViewHolder {
        private CompactImageView image1;

        public ViewHolder2(View itemView) {
            super(itemView);
            count++;
            Log.d("总创建对象",count+"");
            Log.d("当前type =","2");
            image1 = (CompactImageView) itemView.findViewById(R.id.image);
        }
    }

    public class ViewHolder3 extends RecyclerView.ViewHolder {
        private CompactImageView image1;

        public ViewHolder3(View itemView) {
            super(itemView);
            count++;
            Log.d("总创建对象",count+"");
            Log.d("当前type =","3");
            image1 = (CompactImageView) itemView.findViewById(R.id.image);
        }
    }

    public class ViewHolder4 extends RecyclerView.ViewHolder {
        private CompactImageView image1;
        private CompactImageView image2;
        public ViewHolder4(View itemView) {
            super(itemView);
            count++;
            Log.d("总创建对象",count+"");
            Log.d("当前type =","4");
            image1 = (CompactImageView) itemView.findViewById(R.id.image);
            image2 = (CompactImageView) itemView.findViewById(R.id.image1);
        }
    }

    public class ViewHolder5 extends RecyclerView.ViewHolder {
        private CompactImageView image1;
        private CompactImageView image2;
        public ViewHolder5(View itemView) {
            super(itemView);
            count++;
            Log.d("总创建对象",count+"");
            Log.d("当前type =","5");
        }
    }

    public class ViewHolder6 extends RecyclerView.ViewHolder {
        private CompactImageView image1;
        private CompactImageView image2;
        public ViewHolder6(View itemView) {
            super(itemView);
            count++;
            Log.d("总创建对象",count+"");
            Log.d("当前type =","6");
            image1 = (CompactImageView) itemView.findViewById(R.id.image);
            image2 = (CompactImageView) itemView.findViewById(R.id.image1);
        }
    }

    public class ViewHolder7 extends RecyclerView.ViewHolder {
        private CompactImageView image1;
        private CompactImageView image2;
        public ViewHolder7(View itemView) {
            super(itemView);
            count++;
            Log.d("总创建对象",count+"");
            Log.d("当前type =","7");
        }
    }

}