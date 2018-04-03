public class TestaSwitch
{
  public static void main(String[] args)
  {
// Original
//     String s = "xyz"; 
//     switch (s.length()) { // retorna um int
//       case 1:
//         System.out.println("tamanho um");   
//         break;
//       case 2: 
//         System.out.println("tamanho dois");  
//         break; 
//       case 3: 
//         System.out.println("tamanho tres");  
//         break; 
//       default:  
//         System.out.println("nao encontrei"); 
//     }

// 2.1
//     String s = "xyz"; 
//     switch (s.length()) { // retorna um int
//       case 3: 
//         System.out.println("tamanho tres");  
//       case 1:
//         System.out.println("tamanho um");   
//         break;
//       case 2: 
//         System.out.println("tamanho dois");  
//         break; 
//       default:  
//         System.out.println("nao encontrei"); 
//     }

// 2.2
//     String s = "xyzw"; 
//     switch (s.length()) { // retorna um int
//       case 3: 
//         System.out.println("tamanho tres");  
//       case 1:
//         System.out.println("tamanho um");   
//         break;
//       case 2: 
//         System.out.println("tamanho dois");  
//         break; 
//       default:  
//         System.out.println("nao encontrei"); 
//     }

// 2.3
//     String s = "xyzw"; 
//     switch (s.length()) { // retorna um int
//       default:  
//         System.out.println("nao encontrei"); 
//       case 3: 
//         System.out.println("tamanho tres");  
//       case 1:
//         System.out.println("tamanho um");   
//         break;
//       case 2: 
//         System.out.println("tamanho dois");  
//         break; 
//     }

// 2.4
//     String s = "xyzw"; 
//     switch (s.length()) { // retorna um int
//       default:  
//         System.out.println("nao encontrei");
//         break; 
//       case 3: 
//         System.out.println("tamanho tres");  
//       case 1:
//         System.out.println("tamanho um");   
//         break;
//       case 2: 
//         System.out.println("tamanho dois");  
//         break; 
//     }

    String s = "xyzw"; 
    switch (s.length()) { // retorna um int
      default:  
        System.out.println("nao encontrei");
        break; 
      case 3: 
        System.out.println("tamanho tres");  
      case 4: 
        System.out.println("tamanho quatro");  
      case 1:
        System.out.println("tamanho um");   
        break;
      case 2: 
        System.out.println("tamanho dois");  
        break; 
    }

  }
}
