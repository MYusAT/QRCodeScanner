package com.example.qrcodescanner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class QRCodeAdapter extends RecyclerView.Adapter<QRCodeAdapter.ViewHolder> {

    private List<String> qrCodeList;

    public QRCodeAdapter(List<String> qrCodeList) {
        this.qrCodeList = qrCodeList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_qr_code, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String qrCode = qrCodeList.get(position);
        holder.tvQRCode.setText(qrCode);
    }

    @Override
    public int getItemCount() {
        return qrCodeList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvQRCode;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvQRCode = itemView.findViewById(R.id.tvQRCode);
        }
    }
}
