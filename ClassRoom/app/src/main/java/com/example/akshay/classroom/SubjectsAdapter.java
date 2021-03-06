package com.example.akshay.classroom;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by akshay on 27/7/17.
 */

public class SubjectsAdapter extends RecyclerView.Adapter<SubjectsAdapter.ButtonViewHolder> {

    private String[] mSubString;

    public SubjectsAdapter(Context context, int semester,int branch){
        Resources res = context.getResources();
        if(semester== SubjectContract.SubjectEntry.sem1){
            if ( branch == SubjectContract.SubjectEntry.CSE) {
                mSubString = res.getStringArray(R.array.CSE_Subjects_sem1);

            }
            if ( branch == SubjectContract.SubjectEntry.IT) {
                mSubString = res.getStringArray(R.array.IT_Subjects_sem1);

            }
            if(branch==SubjectContract.SubjectEntry.MECH){
                mSubString=res.getStringArray(R.array.MECH_Subjects_sem1);

            }
        }else if(semester== SubjectContract.SubjectEntry.sem2){
            if(branch== SubjectContract.SubjectEntry.CSE){

                mSubString=res.getStringArray(R.array.CSE_Subjects_sem2);

            }
            if(branch== SubjectContract.SubjectEntry.IT){
                mSubString=res.getStringArray(R.array.IT_Subjects_sem2);
            }
            if(branch== SubjectContract.SubjectEntry.MECH){
<<<<<<< HEAD
                mSubString=res.getStringArray(R.array.MECH_Subjects_sem2);
=======
                mSubString=res.getStringArray(R.array.MECH_Subjects_sem2);7
>>>>>>> 955a056b7f092abaec47d625f1e5ec49302371a0
            }
        }



    }

    @Override
    public ButtonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflator=LayoutInflater.from(context);
        View view =inflator.inflate(R.layout.subject_list_item,parent,false);
        ButtonViewHolder ViewHolder =new ButtonViewHolder(view);
        return ViewHolder;
    }

    @Override
    public void onBindViewHolder(ButtonViewHolder holder, int position) {
        holder.bind(mSubString[position]);
    }

    @Override
    public int getItemCount() {
        return mSubString.length;
    }

    class ButtonViewHolder extends RecyclerView.ViewHolder{

        Button mSubjectButtom;
        public ButtonViewHolder(View itemView) {
            super(itemView);
            mSubjectButtom=(Button)itemView.findViewById(R.id.subject_button);

        }
        void bind(String SubName){
            mSubjectButtom.setText(SubName);
        }


    }
}
