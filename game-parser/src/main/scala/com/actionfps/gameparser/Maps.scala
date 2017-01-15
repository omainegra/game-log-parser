package com.actionfps.gameparser

/**
  * Created by me on 04/02/2016.
  */
case class AcMap(name: String, image: String)

case class Maps(maps: Map[String, AcMap])

object Maps {

  private val mapImages = Map(
    "ac_douze" -> "https://cloud.githubusercontent.com/assets/5359646/12695151/1beaa7a4-c745-11e5-9577-2cef2722845c.jpg",
    "ac_edifice" -> "https://cloud.githubusercontent.com/assets/5359646/12695153/1bed793e-c745-11e5-8c0e-c03d3405de47.jpg",
    "ac_elevation" -> "https://cloud.githubusercontent.com/assets/5359646/12695152/1becdf1a-c745-11e5-8564-798f30191533.jpg",
    "ac_gothic" -> "https://cloud.githubusercontent.com/assets/5359646/12695155/1bedf4ae-c745-11e5-9d99-fe708e39e050.jpg",
    "ac_iceroad" -> "https://cloud.githubusercontent.com/assets/5359646/12695156/1bee8e78-c745-11e5-87c2-eb396b6bb2da.jpg",
    "ac_industrial" -> "https://cloud.githubusercontent.com/assets/5359646/12695154/1bed9982-c745-11e5-843f-63653d703313.jpg",
    "ac_ingress" -> "https://cloud.githubusercontent.com/assets/5359646/12695157/1bffd958-c745-11e5-83c7-ed9144405076.jpg",
    "ac_keller" -> "https://cloud.githubusercontent.com/assets/5359646/12695159/1c02901c-c745-11e5-8ac4-91090f8b0852.jpg",
    "ac_lainio" -> "https://cloud.githubusercontent.com/assets/5359646/12695160/1c02a2f0-c745-11e5-80f7-2cb7e21f56fe.jpg",
    "ac_mines" -> "https://cloud.githubusercontent.com/assets/5359646/12695158/1c01c696-c745-11e5-9be6-1debec201ecf.jpg",
    "ac_outpost" -> "https://cloud.githubusercontent.com/assets/5359646/12695162/1c048d40-c745-11e5-97ac-ebf013d8f968.jpg",
    "ac_power" -> "https://cloud.githubusercontent.com/assets/5359646/12695161/1c039192-c745-11e5-820c-2e27a56bb6dd.jpg",
    "ac_rattrap" -> "https://cloud.githubusercontent.com/assets/5359646/12695164/1c16133a-c745-11e5-86e2-a550b5661c61.jpg",
    "ac_scaffold" -> "https://cloud.githubusercontent.com/assets/5359646/12695165/1c1690e4-c745-11e5-810e-0bede39300cb.jpg",
    "ac_shine" -> "https://cloud.githubusercontent.com/assets/5359646/12695166/1c1792f0-c745-11e5-8c8f-8855ae2b44dd.jpg",
    "ac_snow" -> "https://cloud.githubusercontent.com/assets/5359646/12695163/1c156b4c-c745-11e5-90f6-99d378b58fd7.jpg",
    "ac_stellar" -> "https://cloud.githubusercontent.com/assets/5359646/12695167/1c188c0a-c745-11e5-8b07-40b5e2e2d88c.jpg",
    "ac_aqueous" -> "https://cloud.githubusercontent.com/assets/5359646/12695168/1c1a6bec-c745-11e5-8508-06abb1672ef7.jpg",
    "ac_arabian" -> "https://cloud.githubusercontent.com/assets/5359646/12695169/1c2aa62e-c745-11e5-8ea1-b702e731ae30.jpg",
    "ac_arctic" -> "https://cloud.githubusercontent.com/assets/5359646/12695170/1c2bfbf0-c745-11e5-93cd-e34caf816d82.jpg",
    "ac_arid" -> "https://cloud.githubusercontent.com/assets/5359646/12695171/1c2c53d4-c745-11e5-9775-fbe744cea74f.jpg",
    "ac_avenue" -> "https://cloud.githubusercontent.com/assets/5359646/12695173/1c2eec3e-c745-11e5-8b47-9ec2581bddcb.jpg",
    "ac_cavern" -> "https://cloud.githubusercontent.com/assets/5359646/12695172/1c2e8280-c745-11e5-9a23-2c43ffbfe4e0.jpg",
    "ac_complex" -> "https://cloud.githubusercontent.com/assets/5359646/12695174/1c2fdae0-c745-11e5-9fc3-e6c534b350b4.jpg",
    "ac_depot" -> "https://cloud.githubusercontent.com/assets/5359646/12695176/1c3f23ba-c745-11e5-9d82-12a438b9e365.jpg",
    "ac_desert" -> "https://cloud.githubusercontent.com/assets/5359646/12695175/1c3e42c4-c745-11e5-905f-969068723961.jpg",
    "ac_desert2" -> "https://cloud.githubusercontent.com/assets/5359646/12695177/1c421a16-c745-11e5-8997-323d17f281f5.jpg",
    "ac_desert3" -> "https://cloud.githubusercontent.com/assets/5359646/12695178/1c42b7dc-c745-11e5-828b-1ea8b1b376f2.jpg",
    "ac_sunset" -> "https://cloud.githubusercontent.com/assets/5359646/12831400/58da2ee8-cb94-11e5-9d33-822a5357cb2d.jpg",
    "ac_swamp" -> "https://cloud.githubusercontent.com/assets/5359646/12831474/c86cac36-cb94-11e5-828a-4a8748b7a71b.jpg",
    "ac_werk" -> "https://cloud.githubusercontent.com/assets/5359646/12974606/8cf6f8d4-d0b5-11e5-839a-1fbe3d593894.jpg",
    "ac_urban" -> "https://cloud.githubusercontent.com/assets/5359646/13022588/d1f10320-d1e2-11e5-89fa-0e495925d671.jpg"
  )

  val resource: Maps = Maps(
    mapImages.map { case (n, u) =>
      n -> AcMap(name = n, image = u)
    }
  )

  val mapToImage: Map[String, String] = Maps.resource.maps.mapValues(_.image)

}
