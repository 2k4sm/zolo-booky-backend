package com.zolobooky.booky;

import com.zolobooky.booky.appeals.AppealEntity;
import com.zolobooky.booky.appeals.dto.CreateAppealDTO;
import com.zolobooky.booky.appeals.dto.UpdateAppealDTO;
import com.zolobooky.booky.books.BookEntity;
import com.zolobooky.booky.commons.CustomStatus;
import com.zolobooky.booky.users.UserEntity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class AppealAPITestAssets {

	public UserEntity demoUser;

	public BookEntity demoBook;

	public final List<AppealEntity> appealEntityList;

	public AppealEntity appealEntity1;

	public AppealEntity appealEntity2;

	public AppealEntity appealEntity3;

	public AppealEntity appealEntity4;

	public AppealAPITestAssets() {
		demoUser = new UserEntity();
		demoUser.setId(42);
		demoUser.setName("Demo");
		demoUser.setFcmToken("Demo-FCM-TOKEN");

		demoBook = new BookEntity();
		demoBook.setId(900);
		demoBook.setName("Test Book 2");
		demoBook.setStatus(CustomStatus.BookStatus.AVAILABLE);
		demoBook.setThumbnail("TEST IMAGE URL");
		demoBook.setOwner(demoUser);

		appealEntity1 = new AppealEntity();
		appealEntity1.setTrans_id(1);
		appealEntity1.setTrans_status(CustomStatus.TransactionStatus.PENDING);
		appealEntity1.setBookId(demoBook);
		appealEntity1.setBorrowerId(demoUser);
		appealEntity1.setInitiation_date(new Date(1712174174));
		appealEntity1.setCompletion_date(new Date(1712174174));
		appealEntity1.setStatus_change_date(new Date(1712174174));
		appealEntity1.setExpected_completion_date(new Date(1712174174));

		appealEntity2 = new AppealEntity();
		appealEntity2.setTrans_id(2);
		appealEntity2.setTrans_status(CustomStatus.TransactionStatus.PENDING);
		appealEntity2.setBookId(demoBook);
		appealEntity2.setBorrowerId(demoUser);
		appealEntity2.setInitiation_date(new Date(1712174174));
		appealEntity2.setCompletion_date(new Date(1712174174));
		appealEntity2.setStatus_change_date(new Date(1712174174));
		appealEntity2.setExpected_completion_date(new Date(1712174174));

		appealEntity3 = new AppealEntity();
		appealEntity3.setTrans_id(3);
		appealEntity3.setTrans_status(CustomStatus.TransactionStatus.PENDING);
		appealEntity3.setBookId(demoBook);
		appealEntity3.setBorrowerId(demoUser);
		appealEntity3.setInitiation_date(new Date(1712174174));
		appealEntity3.setCompletion_date(new Date(1712174174));
		appealEntity3.setStatus_change_date(new Date(1712174174));
		appealEntity3.setExpected_completion_date(new Date(1712174174));

		appealEntity4 = new AppealEntity();
		appealEntity4.setTrans_id(4);
		appealEntity4.setTrans_status(CustomStatus.TransactionStatus.PENDING);
		appealEntity4.setBookId(demoBook);
		appealEntity4.setBorrowerId(demoUser);
		appealEntity4.setInitiation_date(new Date(1712174174));
		appealEntity4.setCompletion_date(new Date(1712174174));
		appealEntity4.setStatus_change_date(new Date(1712174174));
		appealEntity4.setExpected_completion_date(new Date(1712174174));

		appealEntityList = List.of(appealEntity1, appealEntity2, appealEntity3, appealEntity4);
	}

	public List<AppealEntity> getAllAppeals() {
		return this.appealEntityList;
	}

	public AppealEntity getAppeal() {
		return this.appealEntity3;
	}

	public String toJSONString(CreateAppealDTO dto) {
		Integer borrowerId = dto.getBorrowerId();
		Integer bookId = dto.getBookId();
		Date date = dto.getExpected_completion_date();

		String formattedDate = new SimpleDateFormat("yyyy-MM-dd").format(date);

		return "{\"book_id\":" + bookId + ", \"borrower_id\":" + borrowerId + ", \"expected_completion_date\":\""
				+ formattedDate + "\"}";
	}

	public String toJSONString(UpdateAppealDTO dto) {
		return "{\"trans_status\":\"" + dto.getTrans_status().toString() + "\"}";
	}

	public AppealEntity postAppeal() {
		return this.appealEntity4;
	}

	public AppealEntity updateAppealStatus() {
		return this.appealEntity2;
	}

}
