import axios from 'axios'

const COURSE_API_URL = 'http://localhost:8080'

class CourseDataService {

    retrieveAllCourses() {
        return axios.get(`${COURSE_API_URL}/courses`);
    }
}

export default new CourseDataService()