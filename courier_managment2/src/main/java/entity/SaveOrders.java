package entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class SaveOrders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="tracking_number")
	private Long TrackingNumber;
	private String email;
	private String from_place;
	private String from_name;
	private String from_phone;
	private String from_address;
	private String to_place;
	private String to_name;
	private String to_phone;
	private String to_address;
	private String item;
	private String status;
	private String order_status;
	private String date;
	
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public SaveOrders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getTrackingNumber() {
		return TrackingNumber;
	}
	public String getFrom_place() {
		return from_place;
	}
	public void setFrom_place(String from_place) {
		this.from_place = from_place;
	}
	public SaveOrders(String email,String from_place, String from_name, String from_phone, String from_address, String to_place,
			String to_name, String to_phone, String to_address, String item,String status,String order_status,String date) {
		super();
		this.email=email;
		this.from_place = from_place;
		this.from_name = from_name;
		this.from_phone = from_phone;
		this.from_address = from_address;
		this.to_place = to_place;
		this.to_name = to_name;
		this.to_phone = to_phone;
		this.to_address = to_address;
		this.item = item;
		this.status=status;
		this.order_status=order_status;
		this.date=date;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFrom_name() {
		return from_name;
	}
	public void setFrom_name(String from_name) {
		this.from_name = from_name;
	}
	public String getFrom_phone() {
		return from_phone;
	}
	public void setFrom_phone(String from_phone) {
		this.from_phone = from_phone;
	}
	public String getFrom_address() {
		return from_address;
	}
	public void setFrom_address(String from_address) {
		this.from_address = from_address;
	}
	public String getTo_place() {
		return to_place;
	}
	public void setTo_place(String to_place) {
		this.to_place = to_place;
	}
	public String getTo_name() {
		return to_name;
	}
	public void setTo_name(String to_name) {
		this.to_name = to_name;
	}
	public String getTo_phone() {
		return to_phone;
	}
	public void setTo_phone(String to_phone) {
		this.to_phone = to_phone;
	}
	public String getTo_address() {
		return to_address;
	}
	public void setTo_address(String to_address) {
		this.to_address = to_address;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	
}
