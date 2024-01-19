package tr.edu.medipol.webservis;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ogrenci")
public class OgrenciWebServisi {
	public record Ogrenci(String adSoyad, String id) {};
	
	private static final List<Ogrenci> OGRENCİ_LISTESI = new ArrayList<>();
	static {
		OGRENCİ_LISTESI.add(new Ogrenci("Ali Veli" , "1"));
		OGRENCİ_LISTESI.add(new Ogrenci("Ayse Fatma" , "2"));
		OGRENCİ_LISTESI.add(new Ogrenci("Furkan Enes" , "3"));


	}
@GetMapping("/")
	public List<Ogrenci> listele() {
		return 	OGRENCİ_LISTESI;

	}
}
