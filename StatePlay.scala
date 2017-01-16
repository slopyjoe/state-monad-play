

case class Address( street: String
                    , city: String
                    , state: String)

class AddressBook{
  var addresses: List[Address] = List.empty[Address]
}

trait AddressService {
  def addAddress(address: Address): List[Address]
}


class AddressBooking(addressService: AddressService)

object Starter extends App {
  println("hello world")
}
