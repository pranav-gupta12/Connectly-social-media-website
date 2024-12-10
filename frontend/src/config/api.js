import axios from "axios";
const jwtToken = localStorage.getItem("jwt")
export const API_BASE_URL = "https://connectly-social-media-website-production.up.railway.app";


export const api = axios.create({
  baseURL: API_BASE_URL, 
  headers: {
    'Authorization':`Bearer ${jwtToken}`,
    'Content-Type': 'application/json',
  },
});
