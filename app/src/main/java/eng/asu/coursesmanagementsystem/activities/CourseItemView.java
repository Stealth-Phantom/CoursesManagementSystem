package eng.asu.coursesmanagementsystem.activities;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import eng.asu.coursesmanagementsystem.R;
import eng.asu.coursesmanagementsystem.model.Course;

public class CourseItemView extends RecyclerView.ViewHolder {

    ImageView image;
    TextView courseNameTextView;
    View parent;

    public CourseItemView(@NonNull View itemView, View parent) {
        super(itemView);
        this.parent = parent;
        courseNameTextView = itemView.findViewById(R.id.course_name);
        image = itemView.findViewById(R.id.course_image);
    }

    public void bindCourse(Course course){
        courseNameTextView.setText(course.getName());
        Glide.with(parent).load(course.getImageUrl()).into(image);
    }

}