type reservationPrix = JourAjd of int | MoisAjd of int |
                       NbHeure of int | PrixHeure of int ;;

let ifReduction j m = 

let aPayer reservation =
    let reduction = ifReeduction reservation.JourAjd reservation.MoisAjd in 
        match reservation.NbHeure with
        | 1 -> reduction * reservation.PrixHeure
        | 2 -> reduction * (reservation.PrixHeure * )
        | 3 -> reduction * (reservation.PrixHeure * )
        | 4 -> reduction * (reservation.PrixHeure * ) ;;

(* dobavit' perevod float-int v kontse i dopisat' *)
