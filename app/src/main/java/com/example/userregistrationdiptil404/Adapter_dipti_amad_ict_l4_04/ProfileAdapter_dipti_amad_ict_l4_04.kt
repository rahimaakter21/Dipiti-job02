package com.example.userregistrationdiptil404.Adapter_dipti_amad_ict_l4_04

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.userregistrationdiptil404.Models_dipti_amad_ict_l4_04.UserProfile_dipti_amad_ict_l4_04
import com.example.userregistrationdiptil404.R

class ProfileAdapterDiptil404 (): ListAdapter<UserProfile_dipti_amad_ict_l4_04, ProfileAdapterDiptil404.ProfileViewHolder>(DiffCallback()) {
    private lateinit var  OnItemClickListener:((UserProfile_dipti_amad_ict_l4_04)->Unit)
    private lateinit var  OnDeleteClickListener:((UserProfile_dipti_amad_ict_l4_04)->Unit)
    private lateinit var  OnUpdateClickListener:((UserProfile_dipti_amad_ict_l4_04)->Unit)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.profile_list_layout_dipti_amad_ict_l4_04, parent, false)
        return ProfileViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        val currentItem = getItem(position)
        holder.bind(currentItem)
    }

    fun setOnItemClickListener(listener: (UserProfile_dipti_amad_ict_l4_04) -> Unit) {

        OnItemClickListener = listener
    }
    fun setOnDeleteClickListener(listener: (UserProfile_dipti_amad_ict_l4_04) -> Unit) {
        OnDeleteClickListener = listener
    }
    fun setOnUpdateClickListener(listener: (UserProfile_dipti_amad_ict_l4_04) -> Unit) {
        OnUpdateClickListener = listener
    }

    inner class ProfileViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val profileName: TextView = itemView.findViewById(R.id.userNameTxt)
        private val profileEmail: TextView = itemView.findViewById(R.id.userEmailTxt)
        private val profileDob: TextView = itemView.findViewById(R.id.DobTxt)
        private val profileDistrict: TextView = itemView.findViewById(R.id.DistrictTxt)
        private val profileMobile: TextView = itemView.findViewById(R.id.MobileTxt)
        private val updateBtn: ImageButton = itemView.findViewById(R.id.updateBtn)
        private val deleteBtn: ImageButton = itemView.findViewById(R.id.deleteBtn)

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val profile = getItem(position)
                    OnItemClickListener?.invoke(profile)
                }
            }
            deleteBtn.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val profile = getItem(position)
                    OnDeleteClickListener?.invoke(profile)
                }
            }
            updateBtn.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val profile = getItem(position)
                    OnUpdateClickListener?.invoke(profile)
                }
            }

        }

        fun bind(userProfile: UserProfile_dipti_amad_ict_l4_04) {
            profileName.text = userProfile.name
            profileEmail.text = userProfile.email
            profileDob.text = userProfile.dob
            profileDistrict.text = userProfile.district
            profileMobile.text = userProfile.mobile

        }

    }
}
class  DiffCallback : DiffUtil.ItemCallback<UserProfile_dipti_amad_ict_l4_04>(){
    override fun areItemsTheSame(oldItem: UserProfile_dipti_amad_ict_l4_04, newItem: UserProfile_dipti_amad_ict_l4_04): Boolean {
        return  oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: UserProfile_dipti_amad_ict_l4_04, newItem: UserProfile_dipti_amad_ict_l4_04): Boolean {
        return  oldItem == newItem

    }

}
