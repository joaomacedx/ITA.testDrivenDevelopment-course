package Locadora.Implementation;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	
	private String _name;
	private Vector _rentals = new Vector();
	private int _frequentRenterPoints = 0;
	private double _totalAmount = 0.0;


	public Customer(String name) {
		_name = name;
	};

	public void addRental(Rental rental) {
		_rentals.addElement(rental);
		this._frequentRenterPoints += rental.getFrequentRenterPoints();
		this._totalAmount += rental.getAmount();


	}

	public String getName() {
		return _name;
	}

	public String statement() {
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += "\t" + each.getMovie().getTitle() + "\t"
					+ String.valueOf(getTotalAmount()) + "\n";
		}
		result += "Amount owed is " + String.valueOf(getTotalAmount()) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints())
				+ " frequent renter points";
		return result;
	}

	public int getTotalFrequentRenterPoints() {
		return this._frequentRenterPoints;
	}

	public double getTotalAmount() {
		return this._totalAmount;
	}
}
