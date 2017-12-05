package com.demo.glideimageview;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.demo.glideimage.GlideImageView;
import com.demo.glideimageview.model.ModelUtil;
import com.demo.glideimageview.model.NewsModel;

import java.util.List;

/**
 * @author sunfusheng on 2017/11/10.
 */
public class RecyclerViewActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_recyclerview);

        RecyclerView recyclerView = findViewById(R.id.recycleView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(ModelUtil.getNewsList());
        recyclerView.setAdapter(adapter);
    }

    class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
        private List<NewsModel> list;

        RecyclerViewAdapter(List<NewsModel> list) {
            this.list = list;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_right_image, viewGroup, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder viewHolder, int position) {
            final NewsModel entity = list.get(position);
            viewHolder.tvTitle.setText(entity.getTitle());
            viewHolder.imageView.loadImage(entity.getImage_url(), R.color.placeholder);

            viewHolder.llRootView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(mContext, entity.getTitle(), Toast.LENGTH_SHORT).show();
                }
            });
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            LinearLayout llRootView;
            TextView tvTitle;
            GlideImageView imageView;

            ViewHolder(View view) {
                super(view);
                llRootView = view.findViewById(R.id.ll_root_view);
                tvTitle = view.findViewById(R.id.tv_title);
                imageView = view.findViewById(R.id.giv);
            }
        }
    }
}
