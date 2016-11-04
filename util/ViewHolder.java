

import android.util.SparseArray;
import android.view.View;

/*
 * 使用方法： 在getView里这样 ImageView bananaView = ViewHolder.get(convertView,R.id.banana);
 */
public class ViewHolder {
	private ViewHolder(){
		super();
	}

	@SuppressWarnings("unchecked")
	public static <T extends View> T get(View view, int id) {
		SparseArray<View> viewHolder = (SparseArray<View>) view.getTag();
		if (viewHolder == null) {
			viewHolder = new SparseArray<>();
			view.setTag(viewHolder);
		}
		View childView = viewHolder.get(id);
		if (childView == null) {
			childView = view.findViewById(id);
			viewHolder.put(id, childView);
		}
		return (T) childView;
	}
}