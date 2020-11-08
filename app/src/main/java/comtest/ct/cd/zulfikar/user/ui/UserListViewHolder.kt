package comtest.ct.cd.zulfikar.user.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import comtest.ct.cd.zulfikar.schema.Items
import kotlinx.android.synthetic.main.v_user_item.view.*

class UserListViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    fun bind(user: Items) {
        view.txtTitle.text = user.login
    }
}
