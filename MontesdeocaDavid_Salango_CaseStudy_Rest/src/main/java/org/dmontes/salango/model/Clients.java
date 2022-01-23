package org.dmontes.salango.model;


import java.util.Date;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;



/**
 * The persistent class for the clients database table.
 * 
 */
@Entity
@Table(name = "clients")
//@NamedQuery(name = "Clients.findAll", query = "SELECT c FROM Clients c")
@NamedQuery(name = "Clients.findByEmail", query = "FROM Clients where email =:pemail")
public class Clients {
	//private static final long serialVersionUID = 1L;

	public Clients(Integer clientId, String addressLine1, String addressLine2, String city, String country,
			Date dateCreated, Date dob, String gender, String email, String firstName, Date lastLogin, String lastName,
			String password, String phone, String state, String zipCode) {
		super();
		this.clientId = clientId;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.country = country;
		this.dateCreated = dateCreated;
		this.dob = dob;
		this.gender = gender;
		this.email = email;
		this.firstName = firstName;
		this.lastLogin = lastLogin;
		this.lastName = lastName;
		this.password = password;
		this.phone = phone;
		this.state = state;
		this.zipCode = zipCode;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "clientId", unique = true, nullable = false)
	private Integer clientId;

	@Column(name = "addressLine1", nullable = false, length = 50)
	private String addressLine1;

	@Column(name = "addressLine2", length = 50)
	private String addressLine2;

	@Column(name = "city", nullable = false, length = 50)
	private String city;

	@Column(name = "country", nullable = false, length = 50)
	private String country;

	@Column(name = "dateCreated", nullable = false)
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateCreated;

	@Column(name = "dob", nullable = false)
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dob;

	@Column(name = "gender", nullable = false, length = 1)
	private String gender;

	@Column(name = "email", nullable = false, length = 50)
	private String email;

	@Column(name = "firstName", nullable = false, length = 50)
	private String firstName;

	@Column(name = "lastLogin")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date lastLogin;

	@Column(name = "lastName", nullable = false, length = 50)
	private String lastName;

	@Column(name = "password", nullable = false, length = 100)
	private String password;

	@Column(name = "phone", nullable = false, length = 50)
	private String phone;

	@Column(name = "state", length = 50)
	private String state;

	@Column(name = "zipCode", length = 15)
	private String zipCode;

//	// bi-directional many-to-one association to Orders
//	@OneToMany(mappedBy = "client")
//	private List<Orders> orders;
//
//	// bi-directional many-to-one association to Posts
//	@OneToMany(mappedBy = "client")
//	private List<Posts> posts;
//
//	// bi-directional many-to-one association to Reservations
//	@OneToMany(mappedBy = "client")
//	private List<Reservations> reservations;

	public Clients() {
		this.dateCreated =  new java.util.Date();
	}

	public Integer getClientId() {
		return this.clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
		this.dateCreated =  new java.util.Date();
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

//	public List<Orders> getOrders() {
//		return this.orders;
//	}
//
//	public void setOrders(List<Orders> orders) {
//		this.orders = orders;
//	}
//
//	public Orders addOrder(Orders order) {
//		getOrders().add(order);
//		order.setClient(this);
//
//		return order;
//	}

//	public Orders removeOrder(Orders order) {
//		getOrders().remove(order);
//		order.setClient(null);
//
//		return order;
//	}
//
//	public List<Posts> getPosts() {
//		return this.posts;
//	}
//
//	public void setPosts(List<Posts> posts) {
//		this.posts = posts;
//	}
//
//	public Posts addPost(Posts post) {
//		getPosts().add(post);
//		post.setClient(this);
//
//		return post;
//	}

//	public Posts removePost(Posts post) {
//		getPosts().remove(post);
//		post.setClient(null);
//
//		return post;
//	}

//	public List<Reservations> getReservations() {
//		return this.reservations;
//	}
//
//	public void setReservations(List<Reservations> reservations) {
//		this.reservations = reservations;
//	}
//
//	public Reservations addReservation(Reservations reservation) {
//		getReservations().add(reservation);
//		reservation.setClient(this);
//
//		return reservation;
//	}
//
//	public Reservations removeReservation(Reservations reservation) {
//		getReservations().remove(reservation);
//		reservation.setClient(null);
//
//		return reservation;
//	}

}