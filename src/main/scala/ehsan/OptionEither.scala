package ehsan

object OptionEither {


    // Example
    val customerNameOptionExample:    Option[String] = Some("sahar")
    val customerNameOptionExample_v2: Option[String] = None

    val customerNameEitherExample:    Either[Exception, String] = Right("sahar")
    val customerNameEitherExample_v2: Either[Exception, String] = Left(new RuntimeException("no customer"))


    def getCustomerNameFromDatabase(id: Int): Option[String] = {
      if (id == 123)
        Some("Sahar")
      else
        try{
          // Goes to the database and throws exception below
          throw new RuntimeException(s"not found customer id: $id")
        } catch {
          case e: Exception => None
        }
    }

    def getCustomerNameFromDatabase_v2(id: Int): Either[Exception, String] = {
      if (id == 123)
        Right("Sahar")
      else
        try {
          // Goes to the database and throws exception below
          throw new RuntimeException(s"not found customer id: $id")
        } catch {
          case e: Exception => Left(e)
        }
    }

    def sendSMSToCustomer(customerNameOpt: Option[String]): Unit =
      if (customerNameOpt.isDefined)
        println(s"Congrats! ${customerNameOpt.get}. You are the best customer of Maskan bank.")
      else
        println("No customer provided. The SMS sending is aborted!")

    def sendSMSToCustomer_v2(customerNameOpt: Option[String]): Unit = customerNameOpt
      .map { v =>
        println(s"Congrats! $v. You are the best customer of Maskan bank.")
      }
      .getOrElse(println("No customer provided. The SMS sending is aborted!"))

    def sendSMSToCustomer_v3(customerNameOpt: Option[String]): Unit =
      customerNameOpt match {
        case Some(customerName) => println(s"Congrats! $customerName. You are the best customer of Maskan bank.")
        case None               => println("The SMS sending is aborted! No customer provided(we don't know what is the exception exactly) ")
      }

    def sendSMSToCustomer_v4(customerNameEither: Either[Exception,String]): Unit = {
      customerNameEither match {
        case Right(customerName) => println(s"Congrats! $customerName. You are the best customer of Maskan bank.")
        case Left(exception) => println(s"The SMS sending is aborted! Exception occurred during fetching customer name: ${exception.getMessage}. ")
      }
    }

    val bestCustomerOpt: Option[String] = getCustomerNameFromDatabase(123)

    sendSMSToCustomer(customerNameOpt = bestCustomerOpt)

  }



