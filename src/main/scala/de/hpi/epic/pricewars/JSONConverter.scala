package de.hpi.epic.pricewars

import spray.httpx.SprayJsonSupport
import spray.json.DefaultJsonProtocol

/**
  * Created by Jan on 01.11.2016.
  */
object JSONConverter extends DefaultJsonProtocol with SprayJsonSupport {
  implicit val shippingTimeFormat = jsonFormat2(ShippingTime.apply)
  implicit val offerFormat = jsonFormat7(Offer.apply)
  implicit val merchantFormat = jsonFormat4(Merchant)
  //TODO: write generic formatter
  implicit val offerFailureFormat = jsonFormat2(Failure[Offer])
  implicit val offerSeqFailureFormat = jsonFormat2(Failure[Seq[Offer]])
  implicit val merchantFailureFormat = jsonFormat2(Failure[Merchant])
  implicit val merchantSeqFailureFormat = jsonFormat2(Failure[Seq[Merchant]])
  implicit val unitFailureFormat = jsonFormat2(Failure[Unit])
}
