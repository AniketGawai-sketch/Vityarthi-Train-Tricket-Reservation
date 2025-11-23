package com.aniket.service;

import java.util.List;

import com.aniket.beans.HistoryBean;
import com.aniket.beans.TrainException;

public interface BookingService {

	public List<HistoryBean> getAllBookingsByCustomerId(String customerEmailId) throws TrainException;

	public HistoryBean createHistory(HistoryBean bookingDetails) throws TrainException;

}
