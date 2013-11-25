/*
 jTicketing is a highly configurable solution for the management of online booking, electronic ticket and box office.

 Copyright (C) 2010-2012 OpenPRJ s.r.l.
 All rights reserved

 Site: http://www.openprj.it
 Contact:  info@openprj.it
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2011.09.09 at 10:54:39 PM GMT+05:30
//


package it.openprj.jTicketing.backend.jaxb;

import java.util.ArrayList;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;




@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ticketResponceType", propOrder = {
    "ticketId",
    "ticketPlaceId",
    "ticketTitle",
   	"ticketDesc",
    "ticketSeatNr",
    "ticketSeatCode",
    "ticketEventType",
    "ticketIncidence",
    "ticketExpirationDate",
    "ticketImage",
    "ticketPrices",
    "ticketEventCalendars"
})
public class TicketResponceType {
    
    @XmlElement(required = true)
    protected String ticketId;
    @XmlElement(required = true)
    protected String ticketPlaceId;
    @XmlElement(required = true)
    protected String ticketTitle;
    @XmlElement(required = true)
    protected String ticketDesc;
    @XmlElement(required = true)
    protected String ticketSeatNr;
    @XmlElement(required = true)
    protected String ticketSeatCode;
    @XmlElement(required = true)
    protected String ticketEventType;
    @XmlElement(required = true)
    protected int ticketIncidence;
    @XmlElement(required = true)
    protected Date ticketExpirationDate;
    @XmlElement(required = true)
    protected String ticketImage;
    @XmlElement
    protected ArrayList<PriceTicketResponceType> ticketPrices;
    @XmlElement
    protected ArrayList<EventCalendarResponceType> ticketEventCalendars;
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	public String getTicketPlaceId() {
		return ticketPlaceId;
	}
	public void setTicketPlaceId(String ticketPlaceId) {
		this.ticketPlaceId = ticketPlaceId;
	}
	public String getTicketTitle() {
		return ticketTitle;
	}
	public void setTicketTitle(String ticketTitle) {
		this.ticketTitle = ticketTitle;
	}
	public String getTicketDesc() {
		return ticketDesc;
	}
	public void setTicketDesc(String ticketDesc) {
		this.ticketDesc = ticketDesc;
	}
	public String getTicketSeatNr() {
		return ticketSeatNr;
	}
	public void setTicketSeatNr(String ticketSeatNr) {
		this.ticketSeatNr = ticketSeatNr;
	}
	public String getTicketSeatCode() {
		return ticketSeatCode;
	}
	public void setTicketSeatCode(String ticketSeatCode) {
		this.ticketSeatCode = ticketSeatCode;
	}
	public String getTicketEventType() {
		return ticketEventType;
	}
	public void setTicketEventType(String ticketEventType) {
		this.ticketEventType = ticketEventType;
	}
	public int getTicketIncidence() {
		return ticketIncidence;
	}
	public void setTicketIncidence(int ticketIncidence) {
		this.ticketIncidence = ticketIncidence;
	}
	public Date getTicketExpirationDate() {
		return ticketExpirationDate;
	}
	public void setTicketExpirationDate(Date ticketExpirationDate) {
		this.ticketExpirationDate = ticketExpirationDate;
	}
	public String getTicketImage() {
		return ticketImage;
	}
	public void setTicketImage(String ticketImage) {
		this.ticketImage = ticketImage;
	}
	public ArrayList<PriceTicketResponceType> getTicketPrices() {
		return ticketPrices;
	}
	public void setTicketPrices(ArrayList<PriceTicketResponceType> ticketPrices) {
		this.ticketPrices = ticketPrices;
	}
	public ArrayList<EventCalendarResponceType> getTicketEventCalendars() {
		return ticketEventCalendars;
	}
	public void setTicketEventCalendars(
			ArrayList<EventCalendarResponceType> ticketEventCalendars) {
		this.ticketEventCalendars = ticketEventCalendars;
	}
	
    
	
   

}
