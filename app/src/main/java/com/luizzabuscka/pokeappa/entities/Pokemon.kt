package com.luizzabuscka.pokeappa.entities

import android.os.Parcel
import android.os.Parcelable
import android.os.Parcelable.Creator


data class Pokemon(
    val name: String,
    val type: String,
    val id: String,
    val description: String,
    val hp: String,
    val speed: String,
    val attack: String,
    val defense: String,
    val image: String
) : Parcelable {

  constructor(parcel: Parcel) : this(
      parcel.readString(),
      parcel.readString(),
      parcel.readString(),
      parcel.readString(),
      parcel.readString(),
      parcel.readString(),
      parcel.readString(),
      parcel.readString(),
      parcel.readString()) {
  }

  override fun writeToParcel(parcel: Parcel, flags: Int) {
    parcel.writeString(name)
    parcel.writeString(type)
    parcel.writeString(id)
    parcel.writeString(description)
    parcel.writeString(hp)
    parcel.writeString(speed)
    parcel.writeString(attack)
    parcel.writeString(defense)
    parcel.writeString(image)
  }

  override fun describeContents(): Int {
    return 0
  }

  companion object CREATOR : Creator<Pokemon> {
    override fun createFromParcel(parcel: Parcel): Pokemon {
      return Pokemon(parcel)
    }

    override fun newArray(size: Int): Array<Pokemon?> {
      return arrayOfNulls(size)
    }
  }
}