package com.xworkz.krawardeesgo;


import com.xworkz.krawardeesdto.KrAwardeesDTO;
import com.xworkz.krawardeesservice.KrAwardeesService;
import com.xworkz.krawardeesservice.KrAwardeesServiceImpl;

public class KrAwardeesGo {

	public static void main(String[] args) {
		KrAwardeesDTO awardeesDTO = new KrAwardeesDTO(1, "Kuvempu", 1992, "Literature", false, 89, "Thirthahalli");
		KrAwardeesDTO awardeesDTO1 = new KrAwardeesDTO(2, "Dr. Rajkumar", 1992, "Cinema", false, 46, "gajanur");
		KrAwardeesDTO awardeesDTO2 = new KrAwardeesDTO(3, "S. Nijalingappa", 1999, "Politics", false, 97,
				"Halavagalu‎");
		KrAwardeesDTO awardeesDTO3 = new KrAwardeesDTO(4, "C. N. R. Rao", 2000, "Science", true, 88, "Bangalore");
		KrAwardeesDTO awardeesDTO4 = new KrAwardeesDTO(5, "Bhimsen Joshi", 2005, "Music  ", false, 88, "Gadag   ");
		KrAwardeesDTO awardeesDTO5 = new KrAwardeesDTO(6, "Shri Shri Shivakumara Swami", 2007, "Social Service", false,
				111, "Virapur");
		KrAwardeesDTO awardeesDTO6 = new KrAwardeesDTO(7, "Javare Gowda", 2008, "Education and Literature", false, 100,
				"Chakkere");
		KrAwardeesDTO awardeesDTO7 = new KrAwardeesDTO(8, "Dr.Veerendra Heggade", 2009, "Social Service", true, 73,
				"Bantwal");
		KrAwardeesDTO awardeesDTO8 = new KrAwardeesDTO(9, "Puneeth Rajkumar", 2022, "Cinema", false, 45, "Madras");
		KrAwardeesDTO awardeesDTO9 = new KrAwardeesDTO(10, "Puneeth Rajkumar", 2022, "Cinema", false, 45, "Madras");
		KrAwardeesDTO awardeesDTO10 = new KrAwardeesDTO(11, "Puneeth Rajkumar", 2022, "Cinema", false, 45, "Madras");

		KrAwardeesService serviceImpl = new KrAwardeesServiceImpl();
		serviceImpl.validateAndSave(awardeesDTO);
		serviceImpl.validateAndSave(awardeesDTO1);
		serviceImpl.validateAndSave(awardeesDTO2);
		serviceImpl.validateAndSave(awardeesDTO3);
		serviceImpl.validateAndSave(awardeesDTO4);
		serviceImpl.validateAndSave(awardeesDTO5);
		serviceImpl.validateAndSave(awardeesDTO6);
		serviceImpl.validateAndSave(awardeesDTO7);
		serviceImpl.validateAndSave(awardeesDTO8);
		serviceImpl.validateAndSave(awardeesDTO9);
		serviceImpl.validateAndSave(awardeesDTO10);
	}
}
