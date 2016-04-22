package gear.yc.com.gearapplication.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * GearApplication
 * Created by YichenZ on 2016/4/22 11:10.
 */
public class GearRecyclerViewAdapter<T,R extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<R>
        implements View.OnClickListener{
    protected ArrayList<T> mData;
    protected Context mContext;
    protected OnRecyclerViewItemClickListener mListener;
    protected View view;

    @Override
    public R onCreateViewHolder(ViewGroup parent, int viewType) {
        if(view!=null)
            view.setOnClickListener(this);
        return null;
    }

    @Override
    public void onBindViewHolder(R holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public ArrayList<T> getData() {
        return mData;
    }

    public void setData(ArrayList<T> data) {
        mData = data;
    }

    @Override
    public void onClick(View v) {
        if(mListener!=null){
            mListener.onItemClick(v,v.getTag());
        }
    }

    public interface OnRecyclerViewItemClickListener {
        void onItemClick(View view,Object data);
    }

    public void setOnItemClickListener(OnRecyclerViewItemClickListener listener) {
        mListener = listener;
    }
}