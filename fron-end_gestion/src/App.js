import {
  createBrowserRouter,
  RouterProvider,
  Route,
  Outlet,
} from "react-router-dom";
import Register from "./pages/Register";
import Login from "./pages/Login";
import Prestataires from "./pages/Prestataires";
import Acceuil from "./pages/Acceuil";
import Events from "./pages/Events";
import Navbar from "./components/Navbar";
import Footer from "./components/Footer";


import "./style.scss";
import Formulaire from "./pages/Formulaire";

const Layout = () => {
  return (
    <>
      <Navbar />
      <Outlet />
      <Footer />
    </>
  );
};

const router = createBrowserRouter([
  {
    path: "/",
    element: <Layout />,
    children: [
      {
        path: "/",
        element: <Acceuil />,
      },
      {
        path: "/Events",
        element: <Events />,
      },
      {
        path: "/Formulaire",
        element: <Formulaire />,
      },
      {
        path: "/Prestataires",
        element: <Prestataires />,
      },
    ],
  },
  {
    path: "/register",
    element: <Register />,
  },
  {
    path: "/login",
    element: <Login />,
  },
]);

function App() {
  return (
    <div className="app">
      <div className="container">
        <RouterProvider router={router} />
      </div>
    </div>
  );
}

export default App;
