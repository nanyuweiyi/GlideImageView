package com.demo.glideimageview;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.demo.glideimageview.image.NineImageViewEventAdapter;
import com.demo.glideimageview.model.ImageModel;
import com.demo.glideimageview.model.ModelUtil;
import com.demo.glideimageview.widget.NineImageView.ImageAttr;
import com.demo.glideimageview.widget.NineImageView.NineImageView;
import java.util.ArrayList;
import java.util.List;

public class NineImageViewActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_recyclerview);

        RecyclerView recyclerView = findViewById(R.id.recycleView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(ModelUtil.getImages());
        recyclerView.setAdapter(adapter);
    }

    class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

        private List<ImageModel> list;

        RecyclerViewAdapter(List<ImageModel> list) {
            this.list = list;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_nineimageview, viewGroup, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder viewHolder, int position) {
            ImageModel entity = list.get(position);

            viewHolder.tvTitle.setText(entity.getTitle());

            ArrayList<ImageAttr> imageAttrs = new ArrayList<>();
            for (String url : entity.getImages()) {
                ImageAttr attr = new ImageAttr();
                attr.url = url;
                imageAttrs.add(attr);
            }
            if (viewHolder.nineImageView.getAdapter() != null) {
                viewHolder.nineImageView.setAdapter(viewHolder.nineImageView.getAdapter());
            } else {
                viewHolder.nineImageView.setAdapter(new NineImageViewEventAdapter(viewHolder.nineImageView.getContext(), imageAttrs));
            }
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            TextView tvTitle;
            NineImageView nineImageView;

            ViewHolder(View view) {
                super(view);
                tvTitle = view.findViewById(R.id.tv_title);
                nineImageView = view.findViewById(R.id.nineImageView);
            }
        }
    }
}
