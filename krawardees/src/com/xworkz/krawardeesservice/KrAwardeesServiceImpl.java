package com.xworkz.krawardeesservice;

import com.xworkz.krawardeesdto.KrAwardeesDTO;
import com.xworkz.krawardeesrepository.KrAwardeesRepImpl;
import com.xworkz.krawardeesrepository.KrAwardeesRepository;

public class KrAwardeesServiceImpl implements KrAwardeesService {
	KrAwardeesRepository repository = new KrAwardeesRepImpl();

	@Override
	public boolean validateAndSave(KrAwardeesDTO dto) {
		int id = dto.getId();
		String name = dto.getName();
		int year = dto.getYear();
		String achievement = dto.getAchievement();
		boolean alive = dto.isAlive();
		int age = dto.getAge();
		String place = dto.getPlace();
		if (id > 0 && id <= 15) {
			System.out.println("id is valid ");
			if (name != null && name.length() > 5 && name.length() <= 50) {
				System.out.println("Name is Valid");
				if (year > 1950 && year <= 2022) {
					System.out.println("year is valid");
					if (achievement != null && achievement.length() > 5 && achievement.length() < 50) {
						System.out.println("achievement is valid");
						if (alive == true || alive == false) {
							System.out.println("Alive Property is Valid");
							if (age > 18 && age < 120) {
								System.out.println("Age is Valid");
								if (place != null && place.length() > 5 && place.length() < 50) {
									System.out.println("place is valid");

//									KrAwardeesRepository awardeesRepository = new KrAwardeesRepImpl();
//									awardeesRepository.save(dto);
									System.out.println(dto);
									this.repository.save(dto);
								} else {
									System.err.println("place is Invalid");
								}
							} else {
								System.err.println("Age is Invalid");
							}
						} else {
							System.err.println("Alive Property is Invalid");
						}
					} else {
						System.err.println("achievement is Invalid");
					}
				} else {
					System.err.println("year is Invalid");
				}
			} else {
				System.err.println("name is invalid");
			}
		} else {
			System.err.println("Id is Invalid");
		}
		return true;
	}

}
